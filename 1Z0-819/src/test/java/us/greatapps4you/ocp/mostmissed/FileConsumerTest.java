package us.greatapps4you.ocp.mostmissed;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.security.AccessControlException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class FileConsumerTest {

	private static final String TEST_DIR = "src/test/resources/dir/";
	private List<File> dir;
	private FileConsumer fileConsumer;
	private final Function<File, Boolean> DELETE_FILE_FUNCTION = f -> {
		return f.delete();
	};

	@BeforeEach
	void init() {
		cleanUp();
		try {
			createTestFiles();
		} catch (IOException e) {
			fail(e);
		}
		readDir(TEST_DIR);
		fileConsumer = new FileConsumer(dir);
	}

	@Test
	void testInit() {
		Assertions.assertNotNull(dir);
		Assertions.assertEquals(3, dir.size());
		Assertions.assertNotNull(fileConsumer);
		for (File f : dir) {
			if (!f.getAbsolutePath().endsWith(".txt")) {
				fail("unexpected file " + f.getAbsolutePath());
			}
		}
	}

	@Test
	void testExecuteFunctionOriginalDelete() {
		fileConsumer.executeFunctionOriginal(DELETE_FILE_FUNCTION);
		readDir(TEST_DIR);
		Assertions.assertEquals(0, dir.size());
	}

	@Test
	void testExecuteFunctionPrivilegedDelete() {
		fileConsumer.executeFunctionPrivileged(DELETE_FILE_FUNCTION);
		readDir(TEST_DIR);
		Assertions.assertEquals(0, dir.size());
	}

	@Test
	void testExecuteFunctionPrivilegedProtectionDomainReaddDelete() {
		fileConsumer.executeFunctionPrivilegedProtectionDomainRead(DELETE_FILE_FUNCTION);
		readDir(TEST_DIR);
		Assertions.assertEquals(0, dir.size());
	}

	@Test
	void testExecuteFunctionPrivilegedReadPermissionDelete() {

		Assertions.assertThrows(AccessControlException.class, () -> {
			fileConsumer.executeFunctionPrivilegedReadPermission(DELETE_FILE_FUNCTION);
		});

		readDir(TEST_DIR);
		Assertions.assertEquals(3, dir.size());
	}

	private void createTestFiles() throws IOException {
		for (int i = 1; i <= 3; i++) {
			Path newFilePath = Paths.get(TEST_DIR + i + ".txt");
			Files.createFile(newFilePath);
		}

	}

	private void readDir(String dirPath) {
		try (Stream<Path> stream = Files.list(Paths.get(dirPath))) {
			dir = stream.filter(file -> !Files.isDirectory(file)).map(p -> p.toFile()).collect(Collectors.toList());
		} catch (IOException e) {
			fail(e);
		}
	}

	void cleanUp() {
		for (int i = 1; i <= 3; i++) {
			File targetFile = new File(TEST_DIR + i + ".txt");
			targetFile.delete();
		}
	}

}

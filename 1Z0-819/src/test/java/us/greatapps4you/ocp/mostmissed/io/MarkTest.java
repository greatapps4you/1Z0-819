package us.greatapps4you.ocp.mostmissed.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.jupiter.api.Test;

class MarkTest {

	private static final String TEST_FILE = "src/test/resources/mark/test.txt";

	/**
	 * Will print ABCBB
	 */
	@Test
	void testMark() {
		try (Reader r = new BufferedReader(new FileReader(TEST_FILE))) {
			if (r.markSupported()) {
				BufferedReader in = (BufferedReader) r;
				System.out.print(in.readLine());
				in.mark(100);
				System.out.print(in.readLine());
				System.out.print(in.readLine());
				in.reset();
				System.out.print(in.readLine());
				in.reset();
				System.out.println(in.readLine());
			} else {
				System.out.println("Mark Not Supported");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package us.greatapps4you.ocp.mostmissed.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OCPPathsTest {

	/**
	 * java.lang.IllegalArgumentException will be thrown
	 * 
	 * java.lang.IllegalArgumentException: 'other' is different type of Path
	 */
	@Test
	void testPaths() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Path p1 = Paths.get("photos/goa");
			Path p2 = Paths.get("/index.html");
			Path p3 = p1.relativize(p2);
			System.out.println(p3);
		});

	}

}

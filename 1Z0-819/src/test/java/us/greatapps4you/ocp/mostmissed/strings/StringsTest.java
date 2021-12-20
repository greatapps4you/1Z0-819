package us.greatapps4you.ocp.mostmissed.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringsTest {
	private static final String WHITESPACE_DATA = "     ";
	private static final String NON_WHITESPACE_DATA = "NON WHITESPACE DATA";

	/**
	 * Which of the following expressions can be inserted in the above code so that
	 * the validateInput method will return true if and only if the input string
	 * contains non-whitespace data? Answer: only one is supposed to be correct but
	 * 1 and 3 are correct.
	 */

	@Test
	void testValidateInput1() {
		Assertions.assertFalse(validateInput1(WHITESPACE_DATA));
		Assertions.assertTrue(validateInput1(NON_WHITESPACE_DATA));
	}

	@Test
	void testValidateInput2() {
		// Assertions.assertFalse(validateInput2(" ")); //true
		Assertions.assertTrue(validateInput2(NON_WHITESPACE_DATA));
	}

	@Test
	void testValidateInput3() {
		Assertions.assertFalse(validateInput3(WHITESPACE_DATA));
		Assertions.assertTrue(validateInput3(NON_WHITESPACE_DATA));
	}

	@Test
	void testValidateInput5() {
		// Assertions.assertFalse(validateInput5(" "));//true
		Assertions.assertTrue(validateInput5(NON_WHITESPACE_DATA));
	}

	static boolean validateInput1(String str) {
		return !str.isBlank();
	}

	static boolean validateInput2(String str) {
		return !str.isEmpty();
	}

	static boolean validateInput3(String str) {
		return str.strip() != "";
	}

//	static boolean validateInput4(String str) {
	// return !str.equalsIgnoreBlanks(""); //The method equalsIgnoreBlanks(String)
	// is undefined for the type String
//	}

	static boolean validateInput5(String str) {
		return str.compareTo("") != 0;
	}

}

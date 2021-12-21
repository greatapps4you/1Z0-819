package us.greatapps4you.ocp.mostmissed.loops;

import org.junit.jupiter.api.Test;

class OCPLoopsTest {

	/**
	 * Output: 
	 * 0 
	 * 1 
	 * 2 
	 * 3 
	 * 4
	 */
	@Test
	void testPrint() {
		OCPLoops loops = new OCPLoops();
		loops.crazyLoop();
	}

	@Test
	void testFor() {
		// for (var i=5; i=0; i--) { } //Type mismatch: cannot convert from int to
		// boolean

//		var j=5;
//	      for(int i=0, j+=5;  i<j ; i++) {  j--;  } //Syntax error on token "+=", = expected

//		int i, j;
//	    for (j=10; i<j; j--) { i += 2; } //The local variable i may not have been initialized

//		var i=10;
//	    for ( ; i>0 ; i--) { } // OK

//	    for (int i=0, j=10; i<j; i++, --j) {;} //OK

		// for (var i=0, j=10; i<j; i++, --j) {;} //'var' is not allowed in a compound
		// declaration

	}

}

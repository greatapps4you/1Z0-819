package us.greatapps4you.ocp.mostmissed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MostMissedTest {
		
	@Test
	void testA() {
		A a = new A();
		B b = new B();

		a = (B) (I) b; // ok
		// b = (B)(I) a; // java.lang.ClassCastException: class us.greatapps4you.ocp.A
		// cannot be cast to class us.greatapps4you.ocp.B (us.greatapps4you.ocp.A and
		// us.greatapps4you.ocp.B are in unnamed module of loader 'app')
		// a = (I) b; //Type mismatch: cannot convert from I to A
		// I i = (C) a; // java.lang.ClassCastException: class us.greatapps4you.ocp.A
		// cannot be cast to class us.greatapps4you.ocp.C (us.greatapps4you.ocp.A and
		// us.greatapps4you.ocp.C are in unnamed module of loader 'app')

	}

	@Test
	void testSwitchChar() {
		char a = 'a';
		switch (a) {
		//A character literal can be used as a value for a case label.
		case 'b':
			System.out.println("the char is b");
			break;
		default:
			break;

		}
	}
	
	@Test
	void testSwitchLong() {
		long a = 3L;
		//A 'long' cannot be used as a switch variable.

//		switch (a) { //Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
//		case 3L:
//			System.out.println("the long is 3");
//			break;
//		default:
//			break;
//
//		}
	}
	
	@Test
	void testEmptySwitchBlock() {
		int a = 3;

		//An empty switch block is a valid construct.
		switch (a) {
		//A switch block does not need a default label.
		}
	}
	
	@Test
	void testSwitchDefaultLabel() {
		char c = 'r';
		switch (c) {
		//the default label doest not have to be the last of all the labels.
		default:
			System.out.println("unknown char");
			break;

		case 'b':
			System.out.println("the char is b");
			break;
		
		}
	}
	
	

}

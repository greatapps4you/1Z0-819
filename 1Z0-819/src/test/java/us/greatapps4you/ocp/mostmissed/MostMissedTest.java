package us.greatapps4you.ocp.mostmissed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MostMissedTest {
	
	@Test
	void testAtomicInteger() {
		// What will the following code print?
		AtomicInteger ai = new AtomicInteger();
		Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
		stream.filter(e -> {
			ai.incrementAndGet();
			return e.contains("o");
		}).allMatch(x -> x.indexOf("o") > 0);
		String result = "AI = " + ai;	
		System.out.println("AI = " + ai);
		//Answer: Any number between 1 to 8
	}

	@Test
	void testConversion() {
		char ch = 'A';
		//Conversion from char to long does not need a cast.
		long aLong = ch;
		Assertions.assertEquals(65L, aLong);
		
		byte b = 65;
		//Conversion from byte to short does not need a cast.
		short s = b;
		Assertions.assertEquals(65, s);
		
		//Conversion from short to char needs a cast.
		char aUpperCase = (char)s;
		Assertions.assertEquals('A', aUpperCase);
		
		int i = 10;
		//Conversion from int to float does not need a cast.
		float f = i;
		Assertions.assertEquals(10, f);
		
		
		byte cb = 65;
		char cch = 'A';
		short cs = 65;
		
		//Conversion from byte, char or short to int, long, or float does not need a cast.
		int cInt = cb;
		Assertions.assertTrue(cInt == cb);
		cInt = cch;
		Assertions.assertTrue(cInt == cch);
		cInt = cs;
		Assertions.assertTrue(cInt == cch);
		
		Assertions.assertTrue(cInt == cs);
		
		long caLong = cb;
		Assertions.assertTrue(caLong == cb);
		caLong = cch;
		Assertions.assertTrue(caLong == cch);
		caLong = cs;
		Assertions.assertTrue(caLong == cs);
		
		float aFloat = cb;
		Assertions.assertTrue(aFloat == cb);
		aFloat = cch;
		Assertions.assertTrue(aFloat == cch);
		aFloat = cs;
		Assertions.assertTrue(aFloat == cs);
		
	}
	
	
	@Test
	void testCharAt() {
		String str = "12345";
		char ch = str.charAt(3);
		Assertions.assertEquals('4', ch);
		
		Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
			char ch2 = str.charAt(str.length());
			Assertions.assertEquals('3', ch2);
		});
		
		Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
			char ch2 = str.charAt(-1);
			Assertions.assertEquals('3', ch2);
		});
		
	}
		
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
			//System.out.println("the char is b");
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
//			System.out.println("unknown char");
			break;

		case 'b':
//			System.out.println("the char is b");
			break;
		
		}
	}
	
	

}

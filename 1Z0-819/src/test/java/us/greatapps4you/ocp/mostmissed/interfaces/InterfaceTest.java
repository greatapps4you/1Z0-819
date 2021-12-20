package us.greatapps4you.ocp.mostmissed.interfaces;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class InterfaceTest {

	@Test
	void testAnnotation() {
		@NonNull String str = "";
		
		//var str1 = @NonNull ""; //Syntax error on token(s), misplaced construct(s) | Syntax error on tokens, delete these tokens 
	
		var str2 = (@NonNull String) "";
		
		//Function<Integer, String> f = ( Integer @NonNull val ) -> Integer.toHexString(val); //The left-hand side of an assignment must be a variable
		
		//Function<Integer, String> f = ( var @NonNull val ) -> Integer.toHexString(val); // The left-hand side of an assignment must be a variable
	
		//Function<Integer, String> f = ( @NonNull val ) -> Integer.toHexString(val);//Syntax error, modifiers and annotations are not allowed for the lambda parameter val as its type is elided
	}

}

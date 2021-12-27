package us.greatapps4you.ocp.mostmissed.map;

import org.junit.jupiter.api.Test;

class OCPHashMapTest {

	@Test
	void testPut() {
		OCPHashMap<String,Integer> hashMap = new OCPHashMap<>();
		hashMap.put("Naveen", 100);
		hashMap.put("Tom", 200);
		hashMap.put("Lisa", 300);
		hashMap.put("Peter", 400);
		hashMap.put("Robby", 600);
		
	}

}

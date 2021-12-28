package us.greatapps4you.ocp.mostmissed.map;

import org.junit.jupiter.api.Test;

class OCPHashMapTest {

	@Test
	void testPut() {
		OCPHashMap<String,Integer> hashMap = new OCPHashMap<>();
		hashMap.put("Naveen", 100);
		hashMap.put("Tom", 200);
		hashMap.put("Lisa", 300);
		hashMap.put("Lisa", 400);
		hashMap.put("Lisa", 500);
		hashMap.put("Lisa", 600);
		hashMap.put("Lisa", 700);
		hashMap.put("Peter", 400);
		hashMap.put("Robby", 600);
		hashMap.put("Robert", 245);
		hashMap.put("Julia", 245);
		hashMap.put("Nancy", 245);
		hashMap.put("Amelia", 245);
		hashMap.put("Jack", 245);
		hashMap.put("Jonathan", 245);
		hashMap.put("David", 245);
		
		System.out.println(hashMap.toJSON());
		
	}

}

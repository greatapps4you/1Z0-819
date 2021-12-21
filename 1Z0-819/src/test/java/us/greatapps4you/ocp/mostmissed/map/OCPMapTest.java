package us.greatapps4you.ocp.mostmissed.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class OCPMapTest {

	@Test
	void testMap() {
		Map<String, String> map = new HashMap<>();
		map.put("keystr", "valuestr");
		System.out.println(map.values());
		
		map.remove("keystr");		
		System.out.println(map.values());
	}

}

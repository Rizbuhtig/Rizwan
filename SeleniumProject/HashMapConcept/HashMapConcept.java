package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		Map<String,Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Nishanth", 200);
		marks.put("peter", 400);
		marks.put("Henry", 600);
		
		marks.put(null, 800);
		
		System.out.println(marks.get("peter"));
	}

}

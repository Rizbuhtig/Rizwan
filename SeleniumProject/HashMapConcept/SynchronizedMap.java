package HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMap {
	
	public static void main(String[] args)
	{
		
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("Tom", "Java");
		map1.put("Jerry","C");
		
		Map<String,String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		ConcurrentHashMap<String,String> concurrentMap = new ConcurrentHashMap<>();
		
		concurrentMap.put("1", "Sachin");
		concurrentMap.put("2", "Sehwag");
		concurrentMap.put("3", "Tendulkar");
		
		System.out.println(concurrentMap);
	
	}

}

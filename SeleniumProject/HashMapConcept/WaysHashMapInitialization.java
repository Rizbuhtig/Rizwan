package HashMapConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysHashMapInitialization {
	
	public static HashMap<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("Peter", 200);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Using HashMap Class
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		HashMap<String,Integer> map2 = new HashMap<>();
		
		//2. Using static way
		System.out.println(WaysHashMapInitialization.marksMap.get("Peter"));
		
		//3. using singleton hashmap -- Immutable
		Map<String, Integer> map3 = Collections.singletonMap("test", 400);
		System.out.println(map3.get("test"));
		//map3.put("test", 600); //- UnSupportedOperation Exception is thrown as singleton hashmap cannot override
		
		//4. JDK 8
		
		Map<String, String> m1 = Stream.of(new String [][] {
			
			{"Tom","BusinessMan"},
			{"Larry", "CEO"},
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		System.out.println(m1.get("Tom"));
		m1.put("Lisa", "CEO");
		System.out.println(m1.get("Lisa"));
		
		//5. using simpleEntry
		
		
		Map<String, String> map5 = Stream.of(
				
				new AbstractMap.SimpleEntry<>("Tom","Java"),
				new AbstractMap.SimpleEntry<>("David", "Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
				
				System.out.println(map5.get("Tom"));
				
		//6. using ImmutableSimple Entry
				
		Map<String,String> map6 = Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("Gandhi", "Fighter"),
				new AbstractMap.SimpleImmutableEntry<>("SC Bose", "Patriotic")
				
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map6.get("Gandhi"));
		map6.put("JNehru", "PM");
		System.out.println(map6.get("JNehru"));
		
		//7. JDK 1.9 
		
		//empty Map
		
		Map<String, String> emptyMap = Map.of();// To create emptyMap and we can empty Map
		/*emptyMap.put("Jerry", "C++");
		System.out.println(emptyMap.get("Jerry")); UnSupportedOperation Excetion is thrown as it is empty map. So data cannot be inserted
				*/
		
		//singletonMap
		
		Map<String,String> singleton = Map.of("K1","v1");
		System.out.println(singleton.get("K1"));
		
	   /*singleton.put("K2", "v2");//Unsupported exception as singleton can make only single entry 
			*/ 	
				
		//multi value map : max 10 pairs can be stored
		
		Map<String,String> multiMap = Map.of("K1", "V1", "K2", "v2", "k3", "v3", "k4", "v4", "k5", "v5");
		System.out.println(multiMap.get("k3"));
		
		//OfEntries -- no (key-value) pair limitations -- It is Immutable
		
		Map<String,Integer> mapEntries = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A", 1000),
				new AbstractMap.SimpleEntry<>("B", 1000),
				new AbstractMap.SimpleEntry<>("C", 1000)
				);
		System.out.println(mapEntries.get("C"));
		
		/*mapEntries.put("D", 6000);//UnsupportedOperationException
		*/
	
		/*Guava - In Maven add the dependency in pom.xml file guava and it is Immutable
		
		Map<String,String> titleMaps =ImmutableMap.of("Google", "Google India", "Amazon", "Amazon Shopping");
				System.out.println(titleMaps.get("Google"));
				titleMaps.put("Reddif","Reddif India");// UnSupportedOperationExceptions
						System.out.println(titleMaps.get("Reddif"));


		
		*/
		}
	} 



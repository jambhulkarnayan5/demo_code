package collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Vishal", 10);
		map.put("Ragini",30);
		map.put("Aaibhav", 20);
		
		System.out.println("Map size : "+map.size());
		System.out.println(map);
		System.out.println(map.containsKey("Vishal"));
		System.out.println(map.get("Vishal"));
		
		//1. Iterator using Hashmap  Entryset using iterator
		/*
		 * Iterator<Entry<String, Integer>> iterator=map.entrySet().iterator();
		 * while(iterator.hasNext()) { Entry<String,Integer> entry=iterator.next();
		 * System.out.println(entry.getKey()+"|"+entry.getValue());
		 
		
		//hasNext() :- Returns true if the iteration has more elements.
		//next():-  Returns the next element in the iteration. Throws NoSuchElementException - if the iteration has no more elements
		//entrySet :-  Returns a Set view of the mappings contained in this map.
		//iterator:- Returns an iterator over the elements in this set.
		}*/
		
		
		//2. Iterate through HashMap keyset using iterator.
		Iterator<String> iterator2 =map.keySet().iterator();
		
		while(iterator2.hasNext()) {
			 String key = iterator2.next();
			 System.out.println(key+"|"+map.get(key));
			 	 
		}
		
	   //	3. Iterate hashmap using for each loop
		/*
		 * for(Map.Entry<String, Integer> e : map.entrySet()) {
		 * System.out.println(e.getKey()+ "|" + e.getValue()); }
		 */
	}

}

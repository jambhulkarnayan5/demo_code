package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertArrayListToHashMap {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList();
		names.add("Santosh");
		names.add("Aarti");
		names.add("Sameer");
		names.add("Vaibhav");
		
		System.out.println("List of names "+names);
		
		int index =0;
		
		Map<Integer,String> hmap= new HashMap<>();
		for (String name:names) {
			
			hmap.put(index,name);
			index ++;
		}
		
		System.out.println("Map of list names "+hmap);
		
		Set<Map.Entry<Integer, String>> entry = hmap.entrySet();
		for(Map.Entry e:entry)
		{
		System.out.println(e.getKey()+" | "+e.getValue());
		}
		
		

	}

}

package pack1;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	
	
	public static void main(String[] args) {
		
		
//		HasMap<Key DataType, Value DataType > mapName = new HasMap< Key DataType, Value DataType >();
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		// add key value pair in map
		
		map1.put(100, "Emp1");
		map1.put(101, "Emp2");
		map1.put(102, "Emp3");
		map1.put(103, "Emp4");
		map1.put(104, "Emp5");
		map1.put(105,  null);
		map1.put(106, null);
		map1.put(null, "emp7");
		map1.put(null, "emp8");
		
		
		System.out.println(map1);
		
		
		// fetch the data
		
		System.out.println("104 key Value : " + map1.get(104));
		System.out.println("11000 key Value : " + map1.get(11000));
		
		
		// remove
		
		map1.remove(106);
		System.out.println(map1);
		
		
		// to get the list of keys
		
		 Set<Integer> keySetOfMap1 = map1.keySet();
		 System.out.println(keySetOfMap1);
		 
		 // containsKey
		 
		 System.out.println(map1.containsKey(100));
		
		
	}
	
	
	
	
	
	
}

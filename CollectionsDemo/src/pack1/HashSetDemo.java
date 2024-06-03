package pack1;

import java.util.HashSet;

public class HashSetDemo {
	
	
	public static void main(String[] args) {
		
//		HashSet<DataType> setName = new HashSet< DataType>();
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		// add data in HashSet
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(40);
		set1.add(20);
		set1.add(50);
		
		System.out.println(set1);
		
		
		// remove 
		
		boolean isRemoved = set1.remove(500);
		System.out.println(set1);
		System.out.println(isRemoved);
		
		
		// size
		
		System.out.println(set1.size());
		
		// contains
		
		boolean isPresent = set1.contains(10);
		System.out.println(isPresent);
		
		// 
		
		
		
		
		
		
	}


}

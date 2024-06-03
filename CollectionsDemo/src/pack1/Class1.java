package pack1;

import java.util.ArrayList;

public class Class1 {
	
	
	public static void main(String[] args) {
		
		Integer num2 = 20;
		
//		ArrayList<DataType> listName = new ArrayList<DataType>();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		
		// add elements in ArrayList
		list1.add(10);
		list1.add(num2);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		
		// fetch the data from ArrayList
		
		System.out.println(list1.get(2));
		
		// remove the data
		
		System.out.println(list1);
		list1.remove(3);
		System.out.println(list1);
		
		
		// update data 
		list1.set(3, 100);
		System.out.println(list1);
		
		
		// insert the data in List
		
		list1.add(3, 40);
		System.out.println(list1);
		
		// size
		
		System.out.println(list1.size());
		
		
		for(Integer data : list1)
		{
			System.out.print(data + " ");
		}
		
	}
	
	
	
	
	
	
	

}

package string;

public class Immutability {

	
	
	
	public static void main(String[] args) {
		
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s1;
		
		s1 = "Java";
		s2.concat(" World.");  // new object will be creted inside memory instead of modifying 
		String newS3 = s3.concat(" Testometer");
		
		System.out.println("s1 refers to "+s1);
		System.out.println("s2 refers to "+s2);
		System.out.println("s3 refers to "+s3);
		System.out.println("news3 refers to "+newS3);
		
		
		String s6 = new String("Hello World");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

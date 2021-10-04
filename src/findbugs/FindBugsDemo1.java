/**
 * Author: Sammy Chen, FCU
 */
package findbugs;

public class FindBugsDemo1 {
		
	private static final String myDog = "Tony";

	public  boolean loveForever(String nameOfDog) {		
		if(nameOfDog  == myDog ) 
			return true;
		return false;
		
	}
	
	public static void main(String[] args ) {
		
		FindBugsDemo1 lb1 = new FindBugsDemo1();
		boolean  forever = lb1.loveForever(new String("Tony"));
		System.out.println("I Love Tony: " + forever);		
	}
}

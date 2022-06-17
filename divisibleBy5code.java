package predictOutput;

/* predict if number is idviaiblw by 5*/

public class divisibleBy5code {
	public static void main(String[] args) {
	
		//boolean isDivisibleBy5 = Math.isDivisible(int0,5));
		/*It gives an error message because isDivisible method doesn't exist within Math class*/
 int i = 0;
		/*boolean isDivisibleBy5 = i/5 ? true:false
		Type mismatch: Cannot convert from int to boolean*/
 
		boolean isDivisibleBy5 = i%5 !=5;
		
	//	boolean isDivisibleBy5
	
	System.out.println(isDivisibleBy5);
	
	
	}

}

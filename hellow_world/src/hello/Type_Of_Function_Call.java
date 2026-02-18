package hello;

public class Type_Of_Function_Call {

	public static void main(String[] args) {
	//	1. Chain Function Call (Method Chaining)
		
		/*
		 * Method chaining means calling multiple methods in a single line, 
		 * one after another, because each method returns an object that allows the next method to be called.
		 */

		java.lang.String result = "  hello  ".trim().toUpperCase().concat(" WORLD");
		System.out.println(result);
     
		
		
		//2. Sequence Function Call
		
		// Functions are called one after another in separate lines.

		/*int a = add(5, 3);
		int b = multiply(a, 2);
		printResult(b);*/
		
		//3. Recursive Function Call
		
	//	Recursion occurs when a function calls itself until a stopping condition (base case) is reached.
		
		
		
		/*Chain Function Call......
		 *     Multiple methods called in one line.
		 *     obj.m1().m2().m3()
		 *     
		 *     Sequence Function Call......
		 *     Methods called one after another in order.
		 *     m1(); m2(); m3();
		 *     
		 *     Recursive Function Call......
		 *     A method calls itself
		 *     fun(x) → fun(x-1)
		 */

	}

}

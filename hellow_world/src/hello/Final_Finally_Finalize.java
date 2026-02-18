package hello;

public class Final_Finally_Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
 Final - is Modifier ,used to Variable , method, and class Only.
		 
		   > if CLASS is final - We can't create child class means inherit not allowed
		   > if METHOD is final - we can't ovveride the method
		   > if VARIABLE is final - We can't change value
		   
		   final int x = 10;
           x = 20;            // ❌ Error: cannot change a final variable

           final class Animal { }

           class Dog extends Animal { }  // ❌ Error: cannot extend a final class

		 */
		
		
		
//Finally () method - TO maintain cleanup code.
		
	   //finally is a block in exception handling that always executes, whether an exception occurs or not.
		/*
		 * try {
          int num = 10 / 0;  // Will cause exception
          } catch (Exception e) {
                  System.out.println("Error occurred");
          } 
          finally {
                 System.out.println("This will always run");
          }

		 */
		
		
		
//finalize() (Method)
	/*
	 * 	Finalize is method called by garbage collector to perform cleanup Activity ,before an object is destroyed.
	 * 
	 * class Test {
            protected void finalize() {
                     System.out.println("Object destroyed");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t = null;
        System.gc();   // Request garbage collection
    }
}

	 */
		
		
		 //finally                                          VS         Finalize ()
		
		// > Ensure code Runs after a try-catch                >   cleanup before gabage collection
		//    block
		// > Cleanup resource                                  > called by GC
		
		
		
		//Chatgpt
		
		/*| Keyword / Method | Purpose                  | Simple Meaning                        |
| ---------------- | ------------------------ | ------------------------------------- |
| `final`          | variable, method, class  | **Cannot change**                     |
| `finally`        | exception handling block | **Always runs**                       |
| `finalize()`     | cleanup before GC        | **Called before object is destroyed** |
*/

    }

}

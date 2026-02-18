package hello;

public class Looping_Statement {

	public static void main(String[] args) {
	
		
		//for loop – Executes a block of code a fixed number of times using a counter.
		
		//For loop: when we know starting point and ending point 
		
		//Real-life example: Printing numbers on movie tickets (e.g., Ticket #1 to Ticket #10)
		
		for(int i=1; i<=10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
		
		
		//While loop: whenever we know only condition.
		//Real-life example: Keep playing music until the user presses stop.
	     boolean isplaying = true;
	     
	     while(isplaying) {
	    	 System.out.println("song is playing Now ");
	    	 
	    	 //if user press the stop button
	    	 isplaying = false;
	    	 
	    	 //Use it when the number of repetitions is unknown but depends on a condition.	 
	    	 
	     }
	     
	     
	     
	     
	   //3. do-while loop
	     
	     //do and while both are key words , if we want to execute a set of instruction atleast1 time 
	     //Real-life example: Ask the user if they want to play again.
	     
	     
	     //4. for-each loop
	     
	     /* >A nested loop in Java means placing one 
	      *  loop inside another loop — the inner loop runs completely every time the outer loop executes once.
	      *  
	      *  >A nested loop in Java means placing one loop inside 
	      *  another loop — the inner loop runs completely every time the outer loop executes once.
	      * 
	      */
	     
	     for (int i = 1; i <= 3; i++) {            // Outer loop
	    	    for (int j = 1; j <= 4; j++) {        // Inner loop
	    	        System.out.print("* ");
	    	    }
	    	    System.out.println();  // Move to next line after inner loop ends
	    	}
	}

}

package hello;

public class Desicion_Statement {

	public static void main(String[] args) {
		/*
		 * Decision-making statements in Java help the programmer determine whether
		 * a particular set of instructions should be executed or skipped, based on certain conditions.

For example:
   > If both the username and password are correct, then the program executes the instructions
required to display the home page.
   > Otherwise, the instructions are skipped, and an error message (like “Invalid login”) may be shown instead.
		 */
	
// 1. If Statement
		 
		//Used to execute a block of code only if a condition is true.
		
		int age = 18;
		
		if(age>18) {
			System.out.println("It's Person Eligible to Vote....");
		}
		
		
//2. IF ELSE STATEMENT
		
	//	Used when you want two possible paths — one for true, another for false.
		
		int number = 10;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
		
		
//3. if-else-if ladder  
        
        //Used to check multiple conditions one by one.
        
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
        
  //🔹 4. Nested if statement
        
        //You can put an if inside another if.
        
        int age1 = 25;
        boolean hasID = true;

        if (age1 >= 18) {
            if (hasID) {
                System.out.println("You can enter the club.");
            } else {
                System.out.println("ID required for entry.");
            }
        } else {
            System.out.println("You are underage.");
            
   // 5. SWITCH STATEMENT
            
          /*  A switch case statement in Java is used to execute one block of code 
            from multiple options based on the value of an expression.
            It is an alternative to using multiple if-else statements.
            break taatement is optional.
            */
        }
	}
}

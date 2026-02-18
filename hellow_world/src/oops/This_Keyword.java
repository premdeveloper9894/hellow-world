package oops;


// 1. Using this to refer to current object variable
class Voter_age {
    int age;

    Voter_age(int age) {
        this.age = age;   // this.age = instance variable
    }
}

// 2. Using this to call a method of the same class
class Demo {
    void show() {
        System.out.println("Hello");
    }

    void display() {
        this.show();  // calls show() method
    }
}

// 3. Using this() to call another constructor

class Person {
    Person() {
        System.out.println("Default constructor");
    }

    Person(int x) {
        this();  // calling default constructor
        System.out.println("Parameterized constructor");
    }
}


public class This_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //This 
		  /*
		   * >  This keyword used to Access immediattly current class varibale, method and constructor directly
		   * >  Useful when local and instance variables have the same name.
		   * >  Diffrentiating instance varibale from local variable
		   * 
		   * instance varibale name and local varibale name (or) parameter orey name la iruntha appothu local methood
		   * run aaga this keyword use pannanum.
		   *  
		   */
		
		//*******  Super keyword and this keyword constructor ku first la tha use panna mudiyum
				// but, method la enga venalum call pannikkalam.
	}

}

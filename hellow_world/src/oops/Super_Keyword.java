package oops;

// Using super to access parent variable
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(super.x); // prints parent variable
    }
}


//Using super to call parent method
class Parent1 {
    void display() {
        System.out.println("Parent method");
    }
}

class Child1 extends Parent1 {
    void display() {
        super.display();  // calls parent method
        System.out.println("Child method");
    }
}



//Using super() to call parent constructor
class Parent2 {
    Parent2() {
        System.out.println("Parent constructor");
    }
}

class Child2 extends Parent2 {
    Child2() {
        super();   // calls parent constructor
        System.out.println("Child constructor");
    }
}


public class Super_Keyword {

	public static void main(String[] args) {
		
		//Super -
		   /*
		    * > Super Keyword Used to Access immitely Parant class VARIABLE , METHOD AND CONSTRUCTOR 
		    *   from child class without creating an object of the parant class.
		    * >  Becuase  Super keyword replace  Object creation.
		    * 
		    * > Static method vantha athula super and this keyword use panna kudathu.
		    */
		//*******  Super keyword and this keyword constructor ku first la tha use panna mudiyum
		// but, method la enga venalum call pannikkalam.
		
		
	}

}

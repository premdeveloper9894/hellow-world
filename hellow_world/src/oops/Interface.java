package oops;


interface inte{
	public void m1();
	public Void m2();
}

abstract class prem implements inte{
	public void m1() {
		
	}
}


public class Interface {

	public static void main(String[] args) {
		//interface
		
		/*
		   > Java Interface is a blueprint for a class , that defines a set of abstract methods without
		      a body [ Not implimentation ]
		   > Java Doesn't Support multiple inheritance , becuase diaond problem. So, Interface are used to achive
		     Multiple Inheritance and abstraction.
		   > can't create Object  to interface, but creat reference.
		   > Interface Only Allowed declaration , create new class, then using implementation keyword
		     to inherit class and interface , then call interface method from class.    
		   > We can't use final word fron of interface.
		   > We can't declaration Constructor inside interface.
		   > compalsary we shuld provide implementation for every abstract method of that interface.    
		 
		 */
		
		/*
		 Notes:
		  class - public , abstract
		  method - abstract, default
		  variable - final , static, public
		 */
		
		interface Animal {
		    void eat();   // abstract method
		    void sleep();
		}

		class Dog implements Animal {
		    public void eat() {
		        System.out.println("Dog is eating");
		    }
		    public void sleep() {
		        System.out.println("Dog is sleeping");
		    }
		}

		

	}

}

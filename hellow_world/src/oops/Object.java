package oops;

class Student {
    String name;
    int age;

    void study() {
        System.out.println("The student is studying.");
    }
}


public class Object {
	
public static void main(String[] args) {
	 
	/*  > An Object in Java Instance of a class
	 *  > Object represent real world  Entity or Concept
	 *  > contain Variable and Method
	 *  >create Using the new keyword in Java
	 */
	
	Student s1 = new Student();
	s1.name = "John";
	s1.age = 20;
	s1.study();
	
	/*
	 *   Student - class
	 *   s1 - Object
	 *   name and age- Object data
	 *   
	 */

	
	
}
}

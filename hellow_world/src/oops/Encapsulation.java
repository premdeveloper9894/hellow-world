package oops;

public class Encapsulation {

	public static void main(String[] args) {
		/*
		 * Encapsulation is a binding Of Code .
		 * Encapsulation = hiding + Abstraction
		 * complasary Should follow data hiding and abstraction.
		 * Restrict direct Access to object data.
		 * Data is Wrapped within getter/setter methods.
		 * 
		 * Advantage:
		 *   data security enhancement , maintaibility
		 * DisAdvantage:
		 *   performance wise slow.Because Every time get and set method validate must be required.So 
		 *   length of code to write ,but safe is too good.
		 */
		
		class Student {
		    private int age;   // hidden data

		    public void setAge(int age) {  // controlled access
		        this.age = age;
		    }

		    public int getAge() {
		        return age;
		    }
		}


	}

}

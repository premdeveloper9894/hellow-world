package oops;


class whatsapp {
	void mgs() {
		System.out.println("single tick");
	}}

class whatsapp1 extends whatsapp{
	//override
	void mgs() {
		System.out.println("double tick");
       }
}

class whatsapp2  extends whatsapp1{
	//sub class
@Override
	void mgs(){
		System.out.println("blue tick");
       }
}



public class Polymorphism {

	public static void main(String[] args) {
	/*
	 * > Java Polymorphism means One task many form
	 *        [or]
	 * > Polymorphism in Java means using one method name 
	 *   to perform different behaviors depending on the object or parameters.
	 *   
	 *   eg:
	 *   person == Home - dad, son /        office la = admin officer     /      Store == customer
	 *   
	 */
      // Two types Polumarphism
		
	   //METHOD OVERLOADING [ COMPILE TIME POLYMORPHYSIM ]
		//METHOD OVERRIDING [ RUNTIME POLYMORPHSIM ]
		
		
		/*   METHOD OVERLOADING :
		 *       > Multiple Method with the same name ,but diffrent parameter is Called method Overloading.
		 *       > Compiler responsible to overloading
		 *       > Over loading la null value kudutha list value [ child value ] print aagum
		 *   
		 *       
		 *     WHICH ARGUMENT HIGH PRIORITY ?
		 *        CHILD ARGUMENT HIGH PRIORITY ,WHEN COMPARE WITH PARENT ARGUMENT.
		 *        
		 *     WHEN ACHIVE METHOD OVERLOADING ?
		 *      When method have same  functionality (same operation) 
		 *      then we will achieve method overloading
              eg:Car ,bus
              
              Advantages of Method Overloading:
		 *      >Increases readability
		 *      >Improves code reusability
		 *      >Cleaner and organized code
	}
}
		 */
		
		//METHOD OVERRIDING :
	 /*  >Same method name with same parameters but different 
		   implementation in child class (method overriding).
		 > There must be an is a relationship [inheritance ] ,because method overloading do the only 
		   inheritance
		 * 
		 * Eg: Paytm ,gpay 
		 */
		
		// child class may not satified with parent class implimatation,then child is allowed to redefined method.
		
		
		//DIIFFRENT B/W METHOD OVERLOADING VS OVERRIDING
		
		/*
		 *  P       P        =          new            c ()
		 *      [ref type]                         [object type]
		 *      
		 *      ipadi kuddtha overloading reference type print aagum.
		 *      overrriding object type print aagum.
		 *      
		 */
		
		//
		
		whatsapp2 w = new whatsapp2();
		w.mgs();
	}

}

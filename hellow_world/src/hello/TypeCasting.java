package hello;

public class TypeCasting {
public static void main(String[] args) {
	
	
/* Typecasting is the process of converting one data type to another data type.
	
	1.Widening Type Casting  [ Implicit Casting ]*/
	
	    int num = 100;          // int type
        double doubleNum = num; // automatic type casting: int → double

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + doubleNum);
        
        
        
//	2.Narrow Type Casting    [ Explicit Casting ] 
	
        double doubleNum1 = 9.78;
        int intNum = (int) doubleNum1; // manual type casting: double → int

        System.out.println("Double value: " + doubleNum1);
        System.out.println("Integer value: " + intNum);
	
/*	
1.Widening Type Casting  [ Implicit Casting ]

    >Converting lower datatype to higher datatype               ex: int a =10;  double b=a;//10.0
    >it's changed to automaticallly     
    
2.Narrow Type Casting    [ Explicit Casting ] 

    >Converting higher datatype to lower datatype     ex: double b=1.5; (8) int a=b;//cte                
    > it's changed by Programmer.
 
	*/
	
}
}

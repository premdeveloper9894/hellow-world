package calculator_APP;

import java.util.Scanner;

public class cals {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		while(true) {
	 
		System.out.println("-----CALCULATOR APP-----");
		System.out.println("Enter the First Number: ");
		num1 =sc.nextInt();
		System.out.println("Enter the Second Number: ");
		num2 =sc.nextInt();
		
		System.out.println(" 1.Addition ");
		System.out.println(" 2.Substraction ");
		System.out.println(" 3.Multiplication ");
        System.out.println(" 4.Division ");
        int result =sc.nextInt();
		
		switch(result) {
		case 1:
			System.out.println(num1+num2);
		    break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1*num2);
			break;
		case 4:
			if(num1==0) {
				System.out.println(" Error: Division by zoho");
			}
			else
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Invalid Number");
		  
		  }
		
		}
		

	}

}

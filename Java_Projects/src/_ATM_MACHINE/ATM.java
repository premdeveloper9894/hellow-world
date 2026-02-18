package _ATM_MACHINE;

import java.util.Scanner;

class bank{
	private double balance;
	
	public bank(double initialamount) {
		this.balance=initialamount;
	}
	
	public void checkbalance() {
		System.out.println("Your current balance is " + balance);
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Your amount deposited Successfully...");
		}
	}
	public void withraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("your withraw amount Successfully...");
		}
		else {
			System.out.println("insuffient balance");
		}
	}
}
public class ATM {

	public static void main(String[] args) {
		int num;
	do {
		System.out.println("Press 1 to check balance: ");
		System.out.println("Press 2 to deposit your amount: ");
		System.out.println("press 3 to withraw your amount: ");
		System.out.println("Press 4 to exit:");
		
		Scanner sc = new Scanner(System.in);
		bank bc = new bank(1000);
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			bc.checkbalance();
			break;
		case 2:
			System.out.println("Enter the Amount:");
			double depositAmount =sc.nextDouble();
			bc.deposit(depositAmount);
			break;
		case 3:
			System.out.println("Enter Withraw amount: ");
			double withrawamount =sc.nextDouble();
			bc.withraw(withrawamount);
			break;
		case 4:
			System.out.println("Thank for Using this ATM..");
		   
		}
	
	} while(num !=4);
	
	}
}

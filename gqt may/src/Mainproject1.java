 import java.util.Scanner;

public class Mainproject1{

	public static void main(String[] args) {
	System.out.println("welcome to suresh shopping mall");
	System.out.println("Available product categories are");
	System.out.println("1:clothing,2:mobiles,3:laptops");
	System.out.println("select the choice");
	Scanner sc = new Scanner(System.in);
	int choice1 =sc. nextInt();
	
	if (choice1 ==1) {
		System.out.println("welcome to fasionn verge clothing world ");
		System.out.println("1:plain,2:printed,3:solid");
		
	}
	else if (choice1 ==2) {
		System.out.println("welcome to mobile world");
		System.out.println("1.oneplus,2:apple,3.mi");
		
	}
	else if (choice1 ==3) {
		System.out.println("welcome to laptop world");
		System.out.println("1.xiaomi,2:mac,3:hp");
		
	}
	
	System.out.println("select the choice");
	int choice2 =sc.nextInt();
	if (choice2==1) {
		System.out.println("show the list of plain shirts");
		System.out.println("1:white solid men,2:black solid shirts3:brown solid men");
	}
	int choice3 = sc.nextInt();
	if(choice3==1) {
		System.out.println("product details");
		System.out.println("brand:road star");
		System.out.println("cloth type:pure cotton");
		System.out.println("color :white");
		
	}
	else if (choice3==2){
		System.out.println("product details");
		System.out.println("brand:road star");
		System.out.println("cloth type:cotton");
		System.out.println("color :black ");
		
		
	}
	else if (choice3==3){
		System.out.println("product details");
		System.out.println("brand:road star");
		System.out.println("cloth type:cotton");
		System.out.println("color :brown ");
		
		
	}
	System.out.println("are u willing to buy:yes/no");
	
	
	String choice4 = sc.next(); 
	if (choice4.equalsIgnoreCase("yes")) {
		System.out.println("choose the payment method:1:cod,2:debitcard.3:creditcard,4.neft ");
		int p = sc.nextInt();
		if(p==1) {		
	    System.out.println("purchase sucessfull");
	    System.out.println("thanks for shopping visit again");
	    
	
} 
		else if(p==2) {
			
				System.out.println("enter debit card details");
				int cardno =sc.nextInt();
				System.out.println("enter the expiry date and month]");
				int expdm  = sc.nextInt();
				 System.out.println("enter cvv");
		int cvv = sc.nextInt();
		System.out.println("enter th otp sent to your mobile");
		int otp = sc.nextInt();
		System.out.println("your payment is processing");
			System.out.println("payment done");
		System.out.println("thanks for shopping visit again");
			
		}
		else if(p==3) {	
			System.out.println("enter credit card details");
		}
		int cdno =sc.nextInt();
		System.out.println("enter the expiry date and month]");
		int expdm  = sc.nextInt();
		 System.out.println("enter cvv");
int cvv = sc.nextInt();
System.out.println("enter th otp sent to your mobile");
int otp = sc.nextInt();
System.out.println("your payment is processing");
	System.out.println("payment done");
System.out.println("thanks for shopping visit again");
	
			
		}
	else if (choice4.equalsIgnoreCase("no"))
	{
		System.out.println("exit");
	}
	System.out.println("-------------------");
	System.out.println("Available product categories are");
	System.out.println("1:clothing,2:mobiles,3:laptops");
	

























	}
	}
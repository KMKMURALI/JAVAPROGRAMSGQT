import java.util.Scanner;
class InvalidCustomerException extends Exception{
	public String getMessage() {
		return " invalid creditinals:please try again";
	}
}
class User{
	int accno_main = 11111;
	int pin_main=2222;
	int accno;
	int pin;
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account no");
		accno =sc.nextInt();
		System.out.println("enter the pin");
		pin = sc.nextInt();
		
		
	}
	void verify () throws InvalidCustomerException{
		if (accno==accno_main && pin ==pin_main) {
			System.out.println("user validated");
		}
		else { InvalidCustomerException ice = new  InvalidCustomerException();
		System.out.println(ice.getMessage());
		throw ice;
		
		
		}
			
	}
	
}
class Bank {
	void atmOps(User murali) {
		try {
		murali.getDetails();
		murali.verify();
		
		}
		catch(InvalidCustomerException e1) {
			try {
				murali.getDetails();
				murali.verify();
			}
			catch (InvalidCustomerException e2) {
				try {
					murali.getDetails();
					murali.verify();
					
				}
				catch (InvalidCustomerException e3) {
					System.out.println("user wastwe fellow");
				}
			}
		}
	}
}

public class Customexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User murali= new User();
		Bank b = new Bank();
		b.atmOps(murali);
		
		
     
      
	}

}

import java.util.Scanner;

public class Mallshopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("welcome to amazon shopping mall");
				System.out.println("available product categories are ");
				System.out.println("1:mobiles,2:clothing;3:automobiles");
				System.out.println("select the choice");
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
				if (choice==1) {
					System.out.println("welcome to world of mobiles");
					System.out.println("1:oneplus,2:apple");
				}
				if (choice==2) {
					System.out.println("welcome to world of clothing");
					System.out.println("1:plain,2:solid,");
				}
				
				if (choice==3) {
					System.out.println("welcome to world of automobiles ");
					System.out.println("1:benz,2:zeep,3:scooter");
				}
            	
           	System.out.println("select the choice");
           	int choice1 = sc.nextInt();
           	if(choice1==1) {
           		System.out.println("models available oneplus are 1:10pro,2:9pro");
           	}
           	else 	if(choice1==2) {
           		System.out.println("models available in apple are 1:11promax,2:13pro");
           	}
           	
          
           	if(choice1==1) {
           	
           			System.out.println("select your option");
           			int sel = sc.nextInt();
           			if(sel ==1) {
           			System.out.println("details of oneplus 10pro ");
           			System.out.println("cost 500000");
           			System.out.println("matte blck");
           			System.out.println("wrap charging");
           			}
           			else	if(sel ==2) {
               			System.out.println("details of oneplus 9pro ");
               			System.out.println("cost 230000");
               			System.out.println("matte white");
               			System.out.println("wrap charging");
               			}
           	}
          	if(choice1==2) {
               	
       			System.out.println("select your option");
       			int sel = sc.nextInt();
       			if(sel ==1) {
       			System.out.println("details of apple 11pro ");
       			System.out.println("cost 500000");
       			System.out.println("matte blck");
       			System.out.println("wrap charging");
       			}
       			else	if(sel ==2) {
           			System.out.println("details of aplle 13pro ");
           			System.out.println("cost 130000");
           			System.out.println("matte white");
           			System.out.println("wrap charging");
           			}
       	}
          
           			System.out.println("are you willing to buy :1:yes,2:no");
           			String on =sc.next();
           			if(on.equalsIgnoreCase("yes")){
           				System.out.println("select the payment method");
           				System.out.println("1:cod,2:debit,3:credit");
           				System.out.println("select the option");
           				 int py = sc.nextInt();
           				 if (py==1) {
           					 System.out.println("payment is processing");
           				 System.out.println("payment done ");
           				 System.out.println("tq for shopping");
           				 }
           				 if (py==2) {
           					 System.out.println("enter the debit card number");
           					 int db = sc.nextInt();
           					 System.out.println("enter expiry date and months");
           					 int exp = sc.nextInt();
           					 System.out.println("enter the cvv");
           					int cvv = sc.nextInt();
           		
           					 System.out.println("enter the otp");
           					 int otp = sc.nextInt();
           				
           					 System.out.println("payment is processing");
               				 System.out.println("payment done ");
               				 System.out.println("tq for shopping");
           				 }
           				 if (py==3) {
           					 System.out.println("enter the credit card number");
           					 int db = sc.nextInt();
           					 System.out.println("enter expiry date and months");
           					 int exp = sc.nextInt();
           					 System.out.println("enter the cvv");
           					int cvv = sc.nextInt();
           		
           					 System.out.println("enter the otp");
           					 int otp = sc.nextInt();
           				
           					 System.out.println("payment is processing");
               				 System.out.println("payment done ");
               				 System.out.println("tq for shopping");
           				 }
           				 
           			}
           			
           			else if (on.equalsIgnoreCase("no"))
           			{
           				System.out.println("exit");
           			}
           			
           			
           			
           			
           			
           			
           			
           			
           			
           			
		}
}

//	if (choice==2) {
//	System.out.println("select the option");
//	int opt =sc.nextInt();
//	if (opt==1) {
//		System.out.println("printed types are1:floral:2:printed");}
//}

//	
//}
	
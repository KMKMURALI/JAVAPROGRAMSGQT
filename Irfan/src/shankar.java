/**
 * 
 */

/**
 * @author murali krishna.k
 *
 */

	import java.util.Scanner;

	public class shankar {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Welcome to GQT Shopping Mart:");
			System.out.println("Available product categories are:");
			System.out.println("1.Automobile Accessories 2.Electronic Gadgets 3.Clothing 4.Household Iteams");
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int choice1=sc.nextInt();
			if(choice1==1) {
				System.out.println("Welcome to the world of Automobiles:");
				System.out.println("1.Hatchback 2.Roadster 3.Minivan");
			}
				System.out.println("enter your choice2:");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("Details of Hatchback");
					System.out.println("Mileage: 25kmpl");
					System.out.println("Transmission Type: Manual");
					System.out.println("Fuel capacity : 40liters");
					System.out.println("Seating capacity: 5");
				}
				if(choice2==2) {
					System.out.println("Details of Roadster");
					System.out.println("Mileage: 20kmpl");
					System.out.println("Transmission Type: Manual");
					System.out.println("Fuel capacity : 45liters");
					System.out.println("Seating capacity: 5");
				}
				if(choice2==3) {
					System.out.println("Details of Minivan");
					System.out.println("Mileage: 25kmpl");
					System.out.println("Transmission Type: Manual");
					System.out.println("Fuel capacity : 35liters");
					System.out.println("Seating capacity: 7");
				}
				System.out.println("Are you willing to buy : Yes/No");
				String choice3=sc.next();
				if(choice3=="yes") {
					System.out.println(" Processing towards payment:");
					System.out.println("Enter Card Details:");
					int choice4 = sc.nextInt();
					System.out.println("Payment Successful");
					System.out.println("Congrats Iteam purchased");
				}
		
				else {
					System.out.println("Purchased Denied");
				}

		
			
				System.out.println("---------------------");
			
				System.out.println("Available product categories are:");
				System.out.println("1.Automobile Accessories 2.Electronic Gadgets 3.Clothing 4.Household Iteams");
				System.out.println("Enter your choice:");
				int choice4=sc.nextInt();
				if(choice4==1) {
					System.out.println("Welcome to the world of Electronic Goods:");
					System.out.println("1.Television 2.Mobile Phone 3.Computer");
				}
					System.out.println("enter your choice5:");
					int choice5=sc.nextInt();
					if(choice5==1) {
						System.out.println("Size: 35inchs");
						System.out.println("Internet support: available");
						System.out.println("Cost : 50000");
						System.out.println("Copmany: LG");
					}
					if(choice5==2) {
						System.out.println("Size: 50inchs");
						System.out.println("Internet support: available");
						System.out.println("Cost : 70000");
						System.out.println("Copmany: Sony");
					}
					if(choice5==3) {
						System.out.println("Size: 60inchs");
						System.out.println("Internet support: available");
						System.out.println("Cost : 90000");
						System.out.println("Copmany: Samsung");
					}
					System.out.println("Are you willing to buy : Yes/No");
					String choice6=sc.next();
					if(choice6=="yes") {
						System.out.println(" Processing towards payment:");
						System.out.println("Enter Card Details:");
						int choice7 = sc.nextInt();
						System.out.println("Payment Successful");
						System.out.println("Congrats Iteam purchased");
					}
					else {
						System.out.println("Purchased Denied");
					}
					
					System.out.println("--------------------");
					
					System.out.println("Available product categories are:");
					System.out.println("1.Automobile Accessories 2.Electronic Gadgets 3.Clothing 4.Household Iteams");
					System.out.println("Enter your choice:");
					int choice8=sc.nextInt();
					if(choice8==1) {
						System.out.println("Welcome to the world of Clothing:");
						System.out.println("1.Dress 2.Sweater 3.Coat");
					}
						System.out.println("enter your choice5:");
						int choice9=sc.nextInt();
						if(choice9==1) {
							System.out.println("Details of Dress:");
							System.out.println("color: Black");
							System.out.println("Cost : 1000");
							System.out.println("Made of: cotton");
						}
						if(choice9==2) {
							System.out.println("Details of Sweater:");
							System.out.println("color: white");
							System.out.println("Cost : 1500");
							System.out.println("Made of: wool");
						}
						if(choice9==3) {
							System.out.println("Details of coat");
							System.out.println("color: Black");
							System.out.println("Cost : 5000");
							System.out.println("Made of: fiber");
						}
						System.out.println("Are you willing to buy : Yes/No");
						String choice10=sc.next();
						if(choice10=="yes") {
							System.out.println(" Processing towards payment:");
							System.out.println("Enter Card Details:");
							int choice11 = sc.nextInt();
							System.out.println("Payment Successful");
							System.out.println("Congrats Iteam purchased");
						}
						else {
							System.out.println("Purchased Denied");
						}

						
						System.out.println("--------------------");
						
						System.out.println("Available product categories are:");
						System.out.println("1.Automobile Accessories 2.Electronic Gadgets 3.Clothing 4.Household Iteams");
						System.out.println("Enter your choice:");
						int choice12=sc.nextInt();
						if(choice8==1) {
							System.out.println("Welcome to the world of Clothing:");
							System.out.println("1.Air conditioner 2.Washing machine 3.Refrigerator");
						}
							System.out.println("enter your choice:");
							int choice13=sc.nextInt();
							if(choice13==1) {
								System.out.println("Details of Ac:");
								System.out.println("color: Black");
								System.out.println("Cost : 45000");
								System.out.println("Company: Whilepool");
							
							}
							if(choice13==2) {
								System.out.println("Details of Washing Machine:");
								System.out.println("color: white");
								System.out.println("Cost : 3500");
								System.out.println("Company: LG");
							}
							if(choice13==3) {
								System.out.println("DEtails of Refrigerator");
								System.out.println("color: Black");
								System.out.println("Cost : 30000");
								System.out.println("Company:Sony ");
							}
							System.out.println("Are you willing to buy : Yes/No");
							String choice14=sc.next();
							if(choice14=="yes") {
								System.out.println(" Processing towards payment:");
								System.out.println("Enter Card Details:");
								int choice15 = sc.nextInt();
								System.out.println("Payment Successful");
								System.out.println("Congrats Iteam purchased");
							}
							else {
								System.out.println("Purchased Denied");
							}

							
							System.out.println("--------------------");
							
			}
		}


package javaprograms;

public class conditionsrevison {

	public static void main(String[] args) {
		int age = 31;
		int exp =5;
		int salary = 20000;
		if(age>=31) {
			if(exp>=5) {
				if((salary<15000)) {
					System.out.println("salary increased");
					salary = salary+10000;
					System.out.println("new salary is"+salary);
				}
				else {
					System.out.println("your salary is more than 15k");
				}
				
			}
			else {
				System.out.println("your exp is less than expected");
			}
			
		}
		else {
			System.out.println("your age is less");
		}
	}

}

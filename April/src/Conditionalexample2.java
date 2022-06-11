// nested if means 
// nested if statement
// if condition with in if condition is called as if condition is called  nested if statement
public class Conditionalexample2 {
	public static void main(String[] args) {
		int age = 25;
		int exp =3;
		int salary =10000;
		if (age>=25) {
			if(exp>=3) {
				if ((salary<20000)) {
					salary = salary+15000;
					System.out.println("salary is incremented");
					System.out.println("new salary is :"+salary);
					
				}
				else {
					System.out.println("salary is more than 20k");
				}
				
			}
			else {
				System.out.println("experience is less than expected");
				
			}
		}
		else {
		System.out.println( "your age is less than exoected");
		}
	}

}

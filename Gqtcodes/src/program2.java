public class program2{
	public static void main(String...args) {
		int age =25;
		int exp =3;
		int salary=20000;
		
		if(age>=25) {
			if (exp>=3) {
				if (salary<=25000) {
					salary = salary+5000;
					System.out.println("salary is increased");
					System.out.println("new salary is "+salary);
				
				}
				else {
					System.out.println("salary is more than 25k");
				}
			}
				else {
					System.out.println("experience is less than expected");
				
				}
			}
		}
		
	}
	

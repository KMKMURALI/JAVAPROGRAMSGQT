public class pattern5{
	public static void main(String[] args) {
	int age =35;
	int salary =25000;
	int exp = 5;
	if(age>=25) {
		if(exp>=5) {
			if (salary <30000) {
			salary = salary +10000;
			System.out.println("salary is increased");
			System.out.println("new salary is"+salary);
			}
			else {
				System.out.println("your salary is more than 25k");
			}
		
		}
		else {
			System.out.println("your age is more than 25");
		}
		
	}
	
	}
	
}

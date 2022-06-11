import java.util.Scanner;
public class Exception1 {
public static void main(String[] args) {
	try {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numerator");
	int num = sc.nextInt();
	System.out.println("enter the denoominator");
	int den =sc.nextInt();
	int res = num/den;
	System.out.println(" the result is :"+res);
	}
	catch (ArithmeticException e) {
		System.out.println("divide by 0 is not possible plse check the in puts and try again");
	}
}
}

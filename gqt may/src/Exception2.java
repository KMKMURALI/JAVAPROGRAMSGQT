// example no 2 with multiple catch blocks
// handled arithmetic exception
// handled ArrayOutBondException
import java.util.Scanner;
public class Exception2 {
public static void main(String[] args) {
	try {
		System.out.println("divison operation start");
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numerator");
	int num = sc.nextInt();
	System.out.println("enter the denoominator");
	int den =sc.nextInt();
	int res = num/den;
	System.out.println(" the result is :"+res);

	System.out.println("divison opeartion end");
	System.out.println("array operation start");
	System.out.println("enter the array size");
	int size = sc.nextInt();
	System.out.println("enter the position to insert data");
	int pos =sc.nextInt();
		System.out.println("enter the value to be addded");
	int val = sc.nextInt();
	int a[] = new int [size];
	a[pos]= val;
	System.out.println("arrayoperation is complted");
	}
	catch (ArithmeticException e) {
		System.out.println("divide by 0 is not possible plse check the in puts and try again");
	}
	catch (ArrayIndexOutOfBoundsException e1) {
		System.out.println("please checkthe position value");
	}

	}
}

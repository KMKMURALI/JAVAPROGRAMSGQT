// example no 3with multiple catch blocks
		// handled arithmetic exception
		// handled ArrayOutBondException
		import java.util.Scanner;
	class Operations{	
		void ops() throws ArithmeticException,ArrayIndexOutOfBoundsException{
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
		System.out.println("arrayoperation is complted");}
		
	
        }
	}

public class Exception3 { // calling method

	public static void main(String[] args) {
						
	Operations op =new Operations();
try {op.ops();
}catch (ArithmeticException e) {
	System.out.println("divide by 0 is not possible plse check the in puts and try again");
	throw e;
}
catch (ArrayIndexOutOfBoundsException e1) {
	System.out.println("please checkthe position value")
	throw e;
}

	}

}
// in the above program  if an expection  
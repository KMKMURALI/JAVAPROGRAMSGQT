

//n=11
//
//• conditions:
//
//1. i==0
//2. i==(n-1)
//3. j==0
//4.j==(n-1)
//5.i==(n/2)
//6.j==(n/2)
//7. i==j
//8.i+j==(n-1)
//9.i+j== (n/2)
//10.j-i== (n/2)
//11.i-j==(n/2)
//12. i+j((n-1)+(n/2)) 
import java.util.Scanner;

public class Patternrcb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");

		int n = sc.nextInt();
				for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==(n-1)||j==0||j==(n-1)||i==j||i+j==(n-1)||i==(n/2)||j==(n/2)||i+j==(n/2)
						||j-i==(n/2)||i-j==(n/2)||i+j==((n-1)+n/2)) {
				System.out.print("* ");
										}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

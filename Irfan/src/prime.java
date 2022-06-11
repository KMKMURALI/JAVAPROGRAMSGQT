import java.util.Scanner;

/**
 * 
 */

/**
 * @author murali krishna.k
 *
 */
// 1 3 5 7 11 13 15
public class prime {
public static void main(String...args) {
	int count = 0;
	int n = 100;
	 System.out.println("enter any number");
	 
	
	 for(int i = 2; i<n;i++) {
		 int count = 0;
		 for(int j = 2; j<i;i++) {
			 if (i%j==0)
				 System.out.println(count);
			 System.out.println("	");
			 count++;
		 }
		}
	 if (count ==0) {
		 System.out.println("it is prime");
	
	 }
	 
	 

 }
	 
}



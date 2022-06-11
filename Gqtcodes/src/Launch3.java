/**
 * 
 */

/**
 * @author Murali
 *
 */
class Calculator {
	/**
	 * description:the add () is not having any input and is not returning value
	 * return type : void
	 */
	 int add(int a, int b) {
		int c = a+b;
		return c;
				
	}
	
}
public class Launch3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		int res =c1.add(20,20);
		System.out.println(res);

	}

}

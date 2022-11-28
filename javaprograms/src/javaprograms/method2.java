package javaprograms;

class calculator {
	// no input but is returning integer value
	int add(int a,int b) {
		
		int c =a+b;
		System.out.println(c);
		return c;
	}
}

public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculator c = new calculator();
int res = c.add(10,20);

	}

}
// method 2 NO input but output
//class calculator {
//	// no input but is returning integer value
//	int add() {
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		return c;
//	}
//}
//
//public class method2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//calculator c = new calculator();
//int res = c.add();
//System.out.println(res);
//	}
//
//}
//

import java.util.Scanner;
class mobile{
	int auto_choice=1;
	
	void list() {
		System.out.println("1.oneplus,2.Apple,3.mi");
	}
	void choice() {
		// * take user selection
	}
	void product_detail() {
		// * give details of the item selected by the user
		// * check if user wants to buy it
	}
	void payment() {
		// * take the payment
		// * item purchased
	}
}
class Electronics{
	int auto_choice=2;
	void list() {
		System.out.println("oneplus,mi,apple");
	}
	void choice() {
		// * take user selection
	}
	void product_detail() {
		// * give details of the item selected by the user
		// * check if user wants to buy it
	}
	void payment() {
		// * take the payment
		// * item purchased
	}
}
class Fashion{
	int auto_choice=3;
	void list() {
		System.out.println("oneplus,mi,apple");
	}
	void choice() {
		// * take user selection
	}
	void product_detail() {
		// * give details of the item selected by the user
		// * check if user wants to buy it
	}
	void payment() {
		// * take the payment
		// * item purchased
	}
}
public class Mainproject {

	public static void main(String[] args) {
		mobile a = new mobile();
		System.out.println("welcome to gqt shopping mart");
        System.out.println("Availsble product categories are");
        System.out.println("1.automobile accesories 2.Electronic gadgets 3.clothing");
        System.out.println("enter the choice");
       
        
        Scanner sc = new Scanner (System.in);
        int choice1 = sc.nextInt();
        if(choice1 == 1) {
        	System.out.println("welcome to world of mobiles");
        	
        	
        }
	  
    else if(choice1==2){
    	System.out.println("welcome to world of electronics");
		
	}
    else if(choice1 ==3) {
    	System.out.println("welcome to world of fashion");
    	
    }
	
	
	}

}

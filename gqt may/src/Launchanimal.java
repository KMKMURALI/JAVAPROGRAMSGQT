// polymoropic apporach towards the inherited program
 class animal {
	 void eat(){ 
		 
		 System.out.println("can eat");
	 }
	 void sleep() {
		 System.out.println("can sleep");
	 }
	 void run() {
		 System.out.println("can run");
	 }
 }
 class lion extends animal {
	 void run() {
		 System.out.println(" lion can run");
	 } 
	 void roars() {
		 System.out.println(" lion can roar");
	 }

 }
 class monkey  extends animal {
	 void run() {
		 System.out.println(" monkey can run fast");
	 }
	 void jumps() {
		 System.out.println(" monkey can jump");
	 }

 }
 class deer extends animal {
	 void run() {
		 System.out.println(" deer can run fast");
	 }
	 void jumps() {
		 System.out.println(" monkey can jump");
	 }
 }
 public class Launchanimal{
	 public static void main(String[] args) {
		lion l=new lion ();
		monkey m = new monkey();
		deer d =new deer ();
	animal ref;//parent type reference
	
	ref =l;
	ref .eat();
	ref.sleep();
	ref.run();

System.out.println("-----------");
ref =m;
ref .eat();
ref.sleep();
ref.run();
System.out.println("---------");
ref =d;
ref .eat();
ref.sleep();
ref.run();
System.out.println("---------");
	
	}
 }
 
 
 
 
 
 
 
 
 
 
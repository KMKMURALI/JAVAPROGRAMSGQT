
// rules of in heritance
// private members cannot be inherited

 class Sample {
	private int a =10;
	int b = 20;
	
	void display () {
		System.out.println(a+" "+b);
	}

}
class Sample1 extends Sample{
	void change () {
		a=30;
		b=40;
		
	}
	
}
//rule no 2
//constructurs cannot be inherited


//rule no 3
// multiple in heritance is not permitted in java
class A {
	int a =10;
	int b =20;
	void display () {
		System.out.println(a+" "+b);
			
		}
	}
 class B {
		int a =10;
		int b =20;
		void display () {
			System.out.println(a+" "+b);
				
			}
		}
 class C extends  A,B{ // multiple heritance is not permitted in java
		
		void change () {
			a=40;
			b=50;
			System.out.println(a+" "+b);
		}
		
 }
 
 
 // rule no 4
 // multi level in heritannce is permitted
 class a {
		int a =10;
		int b =20;
		void display () {
			System.out.println(a+" "+b);
				
			}
		}
	 class b extends a {
			int a =10;
			int b =20;
			void display () {
				System.out.println(a+" "+b);
					
				}
			}
	 class c extends b{ // multiple heritance is not permitted in java
			
			void change () {
				a=40;
				b=50;
				System.out.println(a+" "+b);
			}
	 }
	 class animal
	 {
	 	void run () 
	 	{
	 		System.out.println("can run");
	 	}
	 	void eat () {
	 		System.out.println(" can eat");
	 	}
	 	void walk () {
	 		System.out.println(" can walk");
	 	}
	 }
	 class cheeath extends animal {
	 	void run() { // over riding
	 		
	 	System.out.println("cheeath can run very fast");	
	 	}
	 	void jump () { 
	 		System.out.println(" cheeath jumps very long");
	 	}
	 }
	 class punju extends animal {
	 	void run() {
	 		
	 	System.out.println("punju  can  kill fast");	
	 	}
	 	void fire () {
	 		System.out.println("punju can fire correctly");
	 	}
	 }
	 class lions extends animal {
	 	void run() {
	 		
	 	System.out.println("punju  can run kill fast");	
	 	}
	 	void roar () {
	 		System.out.println("lion roars heavily");
	 	}
	 }





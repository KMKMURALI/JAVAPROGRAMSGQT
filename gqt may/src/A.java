
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



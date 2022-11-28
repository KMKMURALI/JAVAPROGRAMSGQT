package javaprograms;

class Calculatr{
	public int m;// instance
	public int n;// instance
	static public int c;// static
	void add() {
		int a = 10;// local
		int b = 20;// local
		Calculatr.c = a+b;	
		System.out.println(Calculatr.c);
	}
	void sub() {
		 m = 40;
		 n = 20;
	Calculatr.c=m-n;
		System.out.println(Calculatr.c);
	}
	
}
public class varaibalesrevi {
	public static void main(String[] args) {
		Calculatr c1 = new Calculatr();
		c1.add();
		c1.sub();
		
	}
}



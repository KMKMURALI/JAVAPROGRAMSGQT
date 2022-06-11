class Sriramulu{
	void eat() {
		System.out.println("can eat");
	}
	void weave(){
	System.out.println("can weave");
	}
	
}
class Ravi extends Sriramulu {
	
	void weave() {
		System.out.println("can weave fastly");
	}
	void work () {
		System.out.println("can work");
	}
}
class Murali extends Ravi {
	void eat() {
		System.out.println("quick eaert");
	}
	void learn () {
		System.out.println("fast learner");
	}
	
	
	
}
public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sriramulu s = new Sriramulu();
		Ravi r = new Ravi();
		Murali m = new Murali();
		Sriramulu ref;
		

	}

}

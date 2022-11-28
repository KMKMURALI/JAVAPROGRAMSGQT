/**
 * 
 */
package javaprograms;

class Dog {
	String name;
	String color;
	String breed;
	int cost;
	void run(){
		System.out.println(" dog is running ");
		
	}
	void walk() {
		System.out.println("dog is walking");
		
	}
	void sleep() {
		System.out.println("dog is sleeping");
	}
}
/**
 * @author Murali
 *
 */
public class Revison1 {

	/**
	 * @param args
	 */
	// This is main method which contains object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		System.out.println("these are the properties of dog");
		d.name="chinni";
		d.color="brown";
		d.breed="gr";
		d.cost=1000;
		System.out.println(d.name);
		System.out.println(d.color);
		System.out.println(d.breed);
		System.out.println(d.cost);
		System.out.println("these are the behaviours");
		d.run();
		d.sleep();
		d.walk();
		System.out.println("----------------------");
		Dog d1 = new Dog();
		System.out.println("these are the properties of dog");
		d1.name="miinni";
		d1.color="red";
		d1.breed="gr";
		d1.cost=900;
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.breed);
		System.out.println(d1.cost);
		System.out.println("these are the behaviours");
		d1.run();
		d1.sleep();
		d1.walk();
		
 
	}

}

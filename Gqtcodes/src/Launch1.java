/**
 * 
 */

/**
 * @author Murali
 *
 */

class Dog{
	  String name;
	  String color;
	  int cost;
	  String breed;
	  
		/**
		 * description: This is the method indicating the run behaviour of dog
		 * return type: void
		 */
        void run() {
        	System.out.println("Dog is running");
        }
    	/**
    	 * description: This is the method indicating the walk behaiour od dog
    	 * return type: void
    	 * 
    	 */
        void walk() {
        	System.out.println("Dog is running");
        }
    	/**
    	 * description: This is the method indicating the eat behaviour of dog
    	 * return type: void
    	 */
        void eat() {
        	System.out.println("Dog is eating");

        }
}
public class Launch1 {

	/**
	 * @param args
	 * description: this is main methid which contains objects of dog class
	 * return type; void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.name = "tommy";
		d.color = "red";
		d.cost =5000;
		d.breed = "rot viller";
		 
		System.out.println("The properties of dog are as folllows");
		System.out.println(d.name);
		System.out.println(d.color);
		System.out.println("d.cost");
		System.out.println("d.breed");
		System.out.println("The behaviour of dog are as follows");
		d.run();
		d.walk();
		d.eat();
		
		
				
				
				
		
		

  
			
				
		    
	}

}

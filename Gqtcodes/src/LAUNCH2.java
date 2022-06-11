/**
 * 
 */

/**
 * @author Murali
 *
 */
class Car{
	String model;
	String brand;
	String color;
	int cost;
	
	/**
	 * description: this is the method indicating the drive behaviour of car
	 * return type:void
	 */

	void drive(){
		System.out.println("Car is driven");
	}
	/**
	 *description: this is the method indicating the start behaviour of car
	 *return type:void
	 */

	void start() {
		System.out.println("Car is starting");
	}
	/**
	 * description: this method indicating the stop behaviour of car
	 * return type:void
	 */

	void stop() {
		System.out.println("Car is stopping");
	
	}
}
public class LAUNCH2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Car c1=new Car();
	    c1.model="agkg";
        c1.brand="bmw";
	    c1.color="white";
	    c1.cost=450000;
	     
	    System.out.println("the properties of car are as follows");
	 	    
	    System.out.println(c1.model);
	    System.out.println(c1.brand);
	    System.out.println(c1.color);
	    System.out.println(c1.cost);
       System.out.println(" the behVIOUR OF CAR ARE AS FOLLOWS");
	    c1.drive();
	    c1.start();
	    c1.stop();
	    
	    System.out.println("----------------------");
	    Car c2=new Car();
	    c2.model="vjkg";
	    c2.brand="ferrari";
	    c2.color="red";
	    c2.cost=10000000;
	    System.out.println("the properties of car are as follows");
	    System.out.println(c2.model);
	    System.out.println(c2.brand);
	    System.out.println(c2.color);
	    System.out.println(c2.cost);
	    System.out.println(" The behaviour of car are as follows");
	    c2.drive();
	    c2.start();
	    c2.stop();
	    
	    

	     
	    
	    
	    
	    
	    
	    
	    
		
		
		
        
        
        
        
        		
	}

}

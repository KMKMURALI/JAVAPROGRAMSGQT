package javaprograms;
// create a car class and represent 3 objects
class Car {
	String color;
	String brand;
	String model;
	int cost;
	
	void start() {
		System.out.println("car is starting");
	}
	void stop() {
		System.out.println("car is stopping");
	}
	
	
	
	
	
}
public class Revison2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c = new Car();
c.color="red";
c.brand="benz";
c.model="az";
c.cost=800000;
System.out.println(c.color);
System.out.println(c.brand);
System.out.println(c.model);
System.out.println(c.cost);
c.start();
c.stop();
System.out.println("--------------");
Car c1 = new Car();
c1.color="voilet";
c1.brand="mg";
c1.model="ooop";
c1.cost=900000;
System.out.println(c1.color);
System.out.println(c1.brand);
System.out.println(c1.model);
System.out.println(c1.cost);
c1.start();
c1.stop();

System.out.println("--------------");
Car c2 = new Car();
c2.color="white";
c2.brand="swift";
c2.model="dezire";
System.out.println(c2.color);
System.out.println(c2.brand);
System.out.println(c2.model);
System.out.println(c2.cost);
c2.cost=90000;
c2.start();
c2.stop();

	}

}

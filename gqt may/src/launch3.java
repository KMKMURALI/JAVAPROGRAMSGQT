 
class OS{
	String name;
	float version;
	public OS(String name, float version) {// constructor is used to assign the values of the object
		super();
		this.name = name;
		this.version = version;
	}
	// using the getters we assign the values independently
	public String getName() {
		return name;
	}
	public float getVersion() {
		return version;
	}
	
}
class Charger {
	String name;
	int volts;
	public Charger(String name, int volts) {
		super();
		this.name = name;
		this.volts = volts;
	}
	public String getName() {
		return name;
	}
	public int getVolts() {
		return volts;
	}
	
}
// main object 
class Mobile {
	// os is a composite object we must create its instance inside main object class
	OS os = new OS("oyygenos",14);
	// charger is a aggregate object we must create method to acces it
	void hasaCharger(Charger c) {
		System.out.println(c.getName());
		System.out.println(c.getVolts());
	}
	
	
}

public class launch3 {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("oneplus",65);
		// accesing aggregate and composite object using main object
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		m.hasaCharger (c);
		
		
	
		
	}

}
 
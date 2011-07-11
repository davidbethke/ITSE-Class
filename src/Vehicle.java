
public class Vehicle {

	/**
	 * @param args
	 */
	String type;
	String make;
	Vehicle(String x, String y){
		type=x;
		make=y;
	}
	public void printVehicle()
	{
		System.out.print("This is a " + type);
		System.out.println(". The manufacture is " + make);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Motorcycle", "Honda");
		v.printVehicle();
		System.out.println("----");
		v = new Vehicle("SUV", "Mazda");
		v.printVehicle();

	}

}


public class Motorcycle {
	private String make;
	private String model;
	private Boolean fuelState= true;
	private Boolean runState=false;
	public void turnOn(){
		if(!runState){
				runState= true;
			
		}
	}
	public void displayMotorcycle(){
		System.out.println("The make of the motorcycle is "+ make+" the model is "+model);
		if (runState){
			System.out.println("It's running!");
		}
		else {
			System.out.println("It's NOT running!");
		}
	}
	public Motorcycle(String ma, String mo){
		make=ma;
		model=mo;
	}
	public void setMake(String m){
		make = m;
	}
	public void setModel(String m){
		model=m;
	}
	public void setFuelState(Boolean fs){
		fuelState = fs;
	}
	public void setRunState(Boolean rs){
		runState = rs;
	}

}

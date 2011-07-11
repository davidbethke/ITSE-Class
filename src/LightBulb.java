
public class LightBulb {

	// restrict bulb color choices
	enum Color {WHITE, BLUE, RED, GREEN, YELLOW};
	private Color bulbColor;
	private int bulbWattage;
	//Bulb State Not ON, is OFF
	private boolean bulbStateOn;
	//constructor
	public LightBulb(){
		//set default values
		bulbColor = Color.WHITE;
		bulbWattage =100;
		bulbStateOn = false;
	}
	//getters setters
	public void setBulbColor(Color c){
		bulbColor=c;
	}
	public void setBulbWattage(int w){
		bulbWattage=w;
	}
	public void setBulbStateOn(boolean s){
		bulbStateOn =s;
	}
	public Color getBulbColor(){
		return bulbColor;
	}
	public int getBulbWattage(){
		return bulbWattage;
	}
	public boolean getBulbStateOn(){
		return bulbStateOn;
	}
	public void displayAttributes(){
		System.out.println("The attributes of the bulb");
		System.out.println("The bulb color is "+ getBulbColor().toString());
		System.out.println("The bulb wattage is "+ getBulbWattage());
		if(getBulbStateOn()){
			System.out.println("The bulb is on");
		}
		else{
			System.out.println("The bulb is off");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		LightBulb lightBulb = new LightBulb();
		// get initial state
		lightBulb.displayAttributes();
		//set COLOR
		lightBulb.setBulbColor(Color.BLUE);
		System.out.println("The bulb color is now "+ lightBulb.getBulbColor().toString());
		//set Wattage
		lightBulb.setBulbWattage(200);
		System.out.println("The bulb wattage is now "+ lightBulb.getBulbWattage());
		//Turn it ON
		lightBulb.setBulbStateOn(true);
		if(lightBulb.getBulbStateOn()){
			System.out.println("The bulb turned on as expected");
		}
		else{
			System.out.println("The bulb is off, maybe its burned out?");
		}
		// display all attributes
		System.out.println("The final state of the bulb");
		lightBulb.displayAttributes();
	
		

	}

}

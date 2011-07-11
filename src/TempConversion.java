
public class TempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsiusTemp=0.0;
		double farenheitTemp=0.0;
		double increment = 20.0;
		System.out.println("Conversion Between Farenheit and Celsius");
		System.out.println("Degrees F \t Degrees C");
		System.out.println("--------------------------");
		while(farenheitTemp <= 300.0){
			celsiusTemp = (5.0/9.0)*(farenheitTemp -32.0);
			//System.out.println(farenheitTemp + "\t"+ celsiusTemp);
			//format for 2 decimal places, and left align the C numbers (neg sign in its own column)
			System.out.printf("%.2f \t\t % .2f %n",farenheitTemp, celsiusTemp);
			farenheitTemp += increment;
			}
		

	}

}

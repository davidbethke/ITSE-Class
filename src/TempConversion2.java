
public class TempConversion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farenheit farenheit = new Farenheit();
		Celsius celsius = new Celsius();
		double increment =20.0;
		double farenheitLowerLimit = 0.0;
		double farenheitLimit = 300.0;
		double celsiusLowerLimit=-18.0;
		double celsiusLimit= 180.0;
		//Farenheit to Celsius
		farenheit.setTemp(farenheitLowerLimit);
		System.out.println("Farenheit to Celsius");
		while(farenheit.getTemp() <= farenheitLimit){
			celsius.setTemp(farenheit.convert(farenheit.getTemp()));
			System.out.printf("%.2f\t% .2f%n",farenheit.getTemp() , celsius.getTemp());
			farenheit.setTemp(farenheit.getTemp()+ increment);
		}
		//Celsius to Farenheit
		celsius.setTemp(celsiusLowerLimit);
		System.out.println("Celsius to Farenheit");
		while(celsius.getTemp() <= celsiusLimit){
			farenheit.setTemp(celsius.convert(celsius.getTemp()));
			System.out.printf("% .2f\t% .2f%n",celsius.getTemp(), farenheit.getTemp());
			celsius.setTemp(celsius.getTemp()+ increment);
		}
		

	}

}

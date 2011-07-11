
public class Farenheit extends Temperature implements TemperatureConversion {
	public double convert(double t){
		return (5.0/9.0)*(t -32.0);
	}
	

}

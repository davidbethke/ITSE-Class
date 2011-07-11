
public class Celsius extends Temperature implements TemperatureConversion{
	public double convert(double t){
		return (t*(9.0/5.0)+32);
	}

}

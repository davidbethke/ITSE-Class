
public class MathCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius =0.0;
		double circleArea = 100.0;
		int feet = 0;
		int inches = 0;
		
		radius = Math.sqrt(circleArea/Math.PI);
		feet=(int)Math.floor(radius);
		inches=(int)Math.round(12.0*(radius-feet));
		System.out.println("The radius of a circle with area " + circleArea + "square feet is\n"+feet+" feet " + inches+ " inches");

	}

}

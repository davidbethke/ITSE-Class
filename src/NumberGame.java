
public class NumberGame {

	/**
	 * @param args
	 */
	void numberCheck(int val){
		System.out.println("value is " + val + ".");
		if (val <= 50){
			System.out.println("The number is less than or equal to 50!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGame ng = new NumberGame();
		ng.numberCheck(1);
		ng.numberCheck(2);
		ng.numberCheck(63);
		ng.numberCheck(72);
		ng.numberCheck(50);

	}

}

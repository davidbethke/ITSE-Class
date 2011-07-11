
public class FizzBuzz {

	/**
	 * @param args
	 */
	private int fizz;
	private int buzz;
	private boolean isFizz;
	private String isBuzz;
	public FizzBuzz(int f, int b){
		fizz=f;
		buzz=b;
	}
	public boolean isFizz(int i){
		if(i%fizz == 0){
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean isBuzz(int i){
		if(i% buzz == 0){
			return true;
		}
		else{
			return false;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int upperLimit = 100;
		 int fizz=3;
		 int buzz=5;
		FizzBuzz fizzBuzz = new FizzBuzz(fizz, buzz);
		for(int i=1; i < upperLimit; i++){
		if(fizzBuzz.isFizz(i) || fizzBuzz.isBuzz(i)){
			if(fizzBuzz.isFizz(i)){
				System.out.print("fizz");
			}
			if(fizzBuzz.isBuzz(i)){
				System.out.print("buzz");
			}
			
		}
		else{
			System.out.print(i);
			
		}
		System.out.println();
		}
		 
	}

}

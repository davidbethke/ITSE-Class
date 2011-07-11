
public class FibCalc {

	/**
	 * @param args
	 */
	public int calcFib(int nMinusTwo, int nMinusOne){
		return nMinusTwo+ nMinusOne;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperLimit=100;
		int eFFzero=0;
		int eFFone=1;
		int i=1;
		int fibTotal;
		int nMinusOne=eFFzero;
		int nMinusTwo=eFFone;
		int fibSum= nMinusOne+nMinusTwo;
		FibCalc fibCalc = new FibCalc();
		System.out.print(eFFzero);
		System.out.print(",");
		System.out.print(eFFone);
		System.out.print(",");
		nMinusOne = eFFone;
		
		while(nMinusOne < upperLimit){
			System.out.print(fibTotal=nMinusOne+nMinusTwo);
		
			nMinusTwo=nMinusOne;
			nMinusOne=fibTotal;
			System.out.print(",");
			
			
		}

	}

}

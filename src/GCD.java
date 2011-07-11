
public class GCD {

	/**
	 * @param args
	 */
	public static int gcd(int p, int q){
		if(q==0){
			System.out.print(p);
			System.out.println("end");
			return p;
			
		}
		return gcd(q, p %q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q ={ 12, 45, 6, 99, 4,5};
		int[] p={90,120,123,44, 99,100};
		for(int i : q){
			for (int j : p){
				System.out.println("i:"+i+" j:"+j);
				gcd(i,j);
			}
		}
	}

}

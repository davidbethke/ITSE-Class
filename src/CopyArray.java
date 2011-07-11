
public class CopyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1={3,6,9,4,8};
		int[] array2 = new int[array1.length];
		for (int i : array1){
			System.out.print(i + " ");	
		}
		System.out.println(" ");
		int count =0;
		while(count < array1.length){
			array2[count] = array1[count];
			System.out.print(array2[count++] + " ");
		}

	}

}

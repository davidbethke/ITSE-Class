
public class CheckString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] contents = {"chap1", "chap2", "chap3"};
		String str = "In my next life I will believe in reincarnation";
		System.out.println("The string is " +str);
		System.out.println("The length is:" + str.length());
		System.out.println("char at pos 7"+ str.charAt(7));
		System.out.println("subsr 24 to 31" + str.substring(24,31));
		System.out.println("index of the char x is "+ str.indexOf('x'));
		System.out.println("Upper Case"+ str.toUpperCase());
		System.out.println("contents 1" + contents[1]);
		System.out.println("content length "+ contents.length);
		
		

	}

}

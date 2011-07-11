
public class Backwards {

	/**
	 * @param args
	 */
	public String reverseString(String s){
		char [] letters= new char[s.length()];
		for(int i=0; i < s.length();i++){
			letters[s.length()-1-i]=  s.charAt(i);
		}
		return new String(letters);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Backwards backwards = new Backwards();
		String[] words ={"hello","goodbye","dave","elsa"};
		for(String w : words){
			System.out.println("Word:"+ w + " Reversed:"+ backwards.reverseString(w)+":");
		}

	}

}

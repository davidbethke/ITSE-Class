
public class NamesLoop {

	/**
	 * @param args
	 */
	String [] lastNames ={"Garner","Berry","Porter","James"};
	String [] address = new String[lastNames.length];
	void printNames(){
		int i = 0;
		for (String s : lastNames){
			System.out.println(s + " lives at " + address[i]);
			i++;
		}
	}
	void setAddress(String [] a){
	int i =0;
	for (String add : a){
		address[i]= add;
		i++;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamesLoop namesLoop = new NamesLoop();
		String [] add = {"565 Kyle Avenue, Austin,TX", "1098 Harbour Ct., Liverpol, MI", "7688 Thatcher Drive, Ping, MO","67 Pine Loop Vlvd., Elgin, TX"};
		
		System.out.println("--------");
		namesLoop.setAddress(add);
		namesLoop.printNames();
		
		

	}

}

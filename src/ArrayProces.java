
public class ArrayProces {

	/**
	 * @param args
	 */
	String[] fruit = {"oranges", "apples", "grapes", "plums"};
	String[] color = new String[fruit.length];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProces a = new ArrayProces();
		a.printFruit();
		System.out.println("------");
		a.color[0] = "orange";
		a.color[1] = "red";
		a.color[2] = "green";
		a.color[3] = "purple";
		a.printFruit();

	}
	void printFruit(){
		int i =0;
		for(String s : fruit){
			System.out.println("Fruit:"+ s + " Color:"+ color[i]);
			i++;
		}
		
	}

}

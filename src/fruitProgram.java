
public class fruitProgram {

	/**
	 * @param args
	 */
	// TODO Auto-generated method stub
	
	public static void main(String[] args) {
		int totalFruit;
		Fruit fruit = new Fruit();
		System.out.println("Starting with "+ fruit.getOranges() +" oranges,");
		System.out.println(fruit.getApples()  + " apples,");
		System.out.println("and "+ fruit.getGrapes() + " grapes.");
		System.out.println("Add 10 to each:");
		System.out.println("Now we have " + fruit.setOranges(fruit.addTo(fruit.getOranges(),10)) +" oranges,");
		System.out.println(fruit.setApples(fruit.addTo(fruit.getApples(),10)) +"  apples,");
		System.out.println("and " + fruit.setGrapes(fruit.addTo(fruit.getGrapes(), 10)) + "grapes." );
		totalFruit= fruit.getOranges() + fruit.getApples() + fruit.getGrapes();
		
		System.out.println("For a total of " + totalFruit);
		



	}

}

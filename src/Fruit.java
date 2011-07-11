
public class Fruit {
	private int oranges;
	private int apples ;
	private int grapes;
	
	public Fruit(){
		 oranges =6;
		 apples =12;
		 grapes=10;
	}
	
	public int getOranges(){
		return oranges;
	}
	public int getApples(){
		return apples;
	}
	public int getGrapes(){
		return grapes;
	}
	public int setOranges(int o){
		  return oranges = o;
	}
	public int setApples(int a){
		 return apples = a;
	}
	public int setGrapes(int g){
		 return grapes = g;
	}
	
	
	public int addTo(int count, int add){
		return count+add;
	}

}

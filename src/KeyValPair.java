
public class KeyValPair {
	private String key;
	private String val;
	public KeyValPair(){
		key=null;
		val=null;
	}
	public KeyValPair(String k, String v){
		key=k;
		val=v;
	}
	public void setKey(String s){
		key=s;
	}
	public void setVal(String s){
		val=s;
	}
	public String getKey(){
		return key;
	}
	public String getVal(){
		return val;
	}

}

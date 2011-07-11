
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.List;
import java.util.regex.*;
import java.util.Map;

public class SlangRemover {

	/**
	 * @param args
	 */
	String[][] dictionary = {
			{"kewl", "cool"},
			{"hipster", "Sylish Rougue"},
			{"dude","gentelman"}
};
	// fill list construct as dictionary using KeyValPair objects
	List<KeyValPair> slangList = new ArrayList<KeyValPair>();
	Map<String,String> slangMap = new HashMap<String, String>();
	
	public SlangRemover(){
		fillSlangList();
		fillSlangMap();
		}
	
	public void fillSlangList(){
		slangList.add(new KeyValPair("kewl","cool"));
		slangList.add(new KeyValPair("hipster","Stylish Rogue"));
		slangList.add(new KeyValPair("dude","gentleman"));
		
	}
	public void fillSlangMap(){
		slangMap.put("kewl", "cool");
		slangMap.put("hipster", "Stylish Rogue");
		slangMap.put("dude", "gentleman");
		for(String key : slangMap.keySet()){
			System.out.println("keyset key:key:"+key);
		}
	}
	
	 public String removeDollarSigns(String s){
		 Pattern pat = Pattern.compile("[a-z]+");
		 Matcher matcher = pat.matcher(s);
		 matcher.find();
		 //System.out.println("s:"+s);
		 //System.out.println(matcher2.group());
		 return matcher.group();
		 //return "hello";
	 }
	 
	 public String removeSlang(String s){
		 String match = null;
		 System.out.println("removeSlangString:"+s+":");
		 for(int row=0; row < dictionary.length; row++){
				for(int col =1; col < dictionary[0].length; col++){
					//System.out.println("key:"+dictionary[row][0]+":");
					if(dictionary[row][0].equals(s) ){
						
						match = dictionary[row][col];
						
					}
					//System.out.println(row+":"+col+":"+dictionary[row][col]);
					//slangDictionary.add(new KeyValPair(dictionary[row][0],dictionary[row][col]));
				}
				
				
			}
		 if (match != null){
			 return match;
		 }
		 else {
			 return "No Match";
		 }
		 
	 }
	
	 public String removeSlangList(String s){
		 ListIterator<KeyValPair> slangItr = slangList.listIterator();
		 System.out.println("passed string:"+s);
		while(slangItr.hasNext()){
		KeyValPair element = slangItr.next();
		System.out.println("key:"+element.getKey() + ":value:"+ element.getVal()+":");
		if(element.getKey().equals(s)){
			return element.getVal();
		}
		
		}
		return "No Match";
	 }
	
	 public String removeSlangMap(String s){
		 System.out.println("Map key:"+s+":");
		 if(slangMap.containsKey(s)){
		 return slangMap.get(s);
		 
	 }
		 else{
			 return "No Match";
		 }
	 }
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String slang = "its $kewl$ not kewl to be a $hipster$ aint it";
		
		String [] splitSlang;
		List<KeyValPair> slangDictionary = new ArrayList<KeyValPair>();
		//System.out.println("dictionary width:"+dictionary.length);
		//System.out.println("dictionary height:"+dictionary[0].length);
		SlangRemover slangRemover = new SlangRemover();
		
		//fill slanDictionary
		//for (String[] key : dictionary){
		//	for(String val : key){
		//		System.out.println("row:"+ val);
		//	}
		//}
		
		splitSlang= slang.split("\b",0);
		for(String s: splitSlang){
			System.out.println("splitSlang:"+s);
		}
		Pattern pat = Pattern.compile("\\$[a-z]*\\$");
		Matcher matcher = pat.matcher(slang);
		StringBuffer result = new StringBuffer();
		
		boolean found;
		while((found=matcher.find())){
			
			//System.out.println("matcher output:"+matcher.group());
			//System.out.println("no $:"+ slangRemover.removeSlang(slangRemover.removeDollarSigns(matcher.group())));
			matcher.appendReplacement(result, slangRemover.removeSlangMap(slangRemover.removeDollarSigns(matcher.group())));
			
		}
		matcher.appendTail(result);
	System.out.println("slangLess:"+result);
		//Using List
	System.out.println("List return:"+ slangRemover.removeSlangList("kewl"));

	}

}

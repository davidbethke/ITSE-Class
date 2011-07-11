
public class WebTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website website = new Website();
		website.setName("World's Best Website!");
		website.setUrl("http://www.sun.java.com");
		website.setDescription("Sun's Java Website");
		System.out.println(website.getName()+" at " +website.getUrl() + "is " + website.getDescription());

	}

}

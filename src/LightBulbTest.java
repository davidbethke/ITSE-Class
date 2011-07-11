import static org.junit.Assert.*;

import org.junit.Test;




public class LightBulbTest {
	LightBulb lightBulb = new LightBulb();
	int bulbWattage=200;
	boolean bulbON =true;

	@Test
	public void testSetBulbWattage() {
		lightBulb.setBulbWattage(bulbWattage);
		assertEquals("Result",bulbWattage,lightBulb.getBulbWattage());

	}

	@Test
	public void testSetBulbStateOn() {
		lightBulb.setBulbStateOn(bulbON);
		assertEquals("Result",bulbON,lightBulb.getBulbStateOn());
	}

	
}

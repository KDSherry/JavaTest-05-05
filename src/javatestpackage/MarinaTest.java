package javatestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaTest {
	Marina testMarina = new Marina("location",1,1,1,100,true);
	@Test
	public void setLocationTest() {
		testMarina.setLocation("london");
		assertEquals("london", testMarina.getLocation());
	}
	
	@Test
	public void setSCapTest(){
		testMarina.setSmallCap(4);
		assertEquals(4, testMarina.getSmallCap());
	}
	
	@Test
	public void setMCapTest(){
		testMarina.setMedCap(5);
		assertEquals(5, testMarina.getMedCap());
	}
	
	@Test
	public void setLCapTest(){
		testMarina.setLargeCap(6);
		assertEquals(6, testMarina.getLargeCap());
	}
	
	@Test
	public void setMaxMastHeightTest(){
		testMarina.setMaxMastHeight(8);
		assertEquals(8, testMarina.getMaxMastHeight());
	}
	
	@Test
	public void setHasRepairsTest(){
		testMarina.setHasRepairs(false);
		assertEquals(false, testMarina.getHasRepairs());
	}
}

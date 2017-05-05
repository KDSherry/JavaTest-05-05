package javatestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {
	Boat testBoat = new Boat("",  "",  1);
	
	@Test
	public void setNameTest() {
		testBoat.setName("yellowsub");
		assertEquals("yellowsub", testBoat.getName());
	}
	
	@Test
	public void setOriginTest(){
		testBoat.setOrigin("Britain");
		assertEquals("Britain", testBoat.getOrigin());
	}
	
	@Test
	public void setSize(){
		testBoat.setSize(2);
		assertEquals(2, testBoat.getSize());
	}
}

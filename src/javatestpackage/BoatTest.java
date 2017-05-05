package javatestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {
	Boat testBoat = new Boat("",  "",  "medium");
	
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
		testBoat.setSize("medium");
		assertEquals("medium", testBoat.getSize());
	}
}

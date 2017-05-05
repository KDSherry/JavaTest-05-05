package javatestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	Person testPerson1 = new Person("firstname",  "surname",  "DOB", "nationality");
	Person testPerson2 = new Person("firstname",  "surname",  "DOB", "nationality", "visaInfo");
	
	@Test
	public void setFirstNameTest() {
		 testPerson1.setFName("bob");
		assertEquals("bob", testPerson1.getFName());
	}
	
	@Test
	public void setSurNameTest() {
		testPerson1.setSurname("smith");
		assertEquals("smith", testPerson1.getSurname());
	}
	
	@Test
	public void setDOBTest() {
		testPerson1.setDOB("11/11/1111");
		assertEquals("11/11/1111", testPerson1.getDOB());
	}
	
	@Test
	public void setNationalitTesty() {
		testPerson1.setNationality("British");
		assertEquals("British", testPerson1.getNationality());
	}
	
	@Test
	public void setVisaInfoTest() {
		testPerson2.setVisaInfo("visavisavisa");
		assertEquals("visavisavisa", testPerson2.getVisaInfo());
	}
	
	
}

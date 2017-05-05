package javatestpackage;

public class Person {
	//Attributes
	private String firstName;
	private String surname;
	private String DOB;
	private String nationality;
	private String visaInfo = "UK resident";
	
	//Constructors
	public Person(String firstName, String surname, String DOB, String nationality){
		this.DOB= DOB;
		this.firstName=firstName;
		this.surname = surname;
		this.nationality = nationality;
	}
	public Person(String firstName, String surname, String DOB, String nationality, String visaInfo){
		this.DOB= DOB;
		this.firstName=firstName;
		this.surname = surname;
		this.nationality = nationality;
		this.visaInfo = visaInfo;
	}
	
	//getters and setters
	public String getFName(){
		return firstName;
	}
	public void setFName(String string) {
		
		this.firstName = string;
	}
	public void setSurname(String string) {
		
		this.surname = string;
	}
	public Object getSurname() {
		
		return surname;
	}
	public void setDOB(String string) {
		this.DOB = string;
		
	}
	public Object getDOB() {
		
		return DOB;
	}
	public void setNationality(String string) {
		
		this.nationality = string;
	}
	public Object getNationality() {
		
		return nationality;
	}
	public void setVisaInfo(String string) {
		// TODO Auto-generated method stub
		this.visaInfo = string;
		
	}
	public Object getVisaInfo() {
		// TODO Auto-generated method stub
		return visaInfo;
	}
	
	
}

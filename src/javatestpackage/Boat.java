package javatestpackage;

import java.util.ArrayList;

public class Boat implements Vehicle{
	//Attributes
	private String name;
	private String countryOfOrigin;
	private float size;
	private int mastHeight;
	private boolean needsRepairs = false;
	private String currentLocation;
	
	ArrayList<Person> crew = new ArrayList<Person>();
	ArrayList<Person> owner = new ArrayList<Person>();
	Person captain;
	
	//speed initialised at rest
	private int speed = 0;
	
	//constructor
	public Boat(String name, String countryOfOrigin, float f){
		this.name = name;
		this.countryOfOrigin = countryOfOrigin;
		this.size = f;
	}
	
	public void newCrew(String firstName, String surname, String DOB, String nationality){
		crew.add(new Person(firstName, surname, DOB, nationality));
	}
	
	public void newOwner(String firstName, String surname, String DOB, String nationality){
		owner.add(new Person(firstName, surname, DOB, nationality));
	}
	
	public void setCaptain(Person p){
		for (Person q : crew){
			if (q .equals(p)){
				System.out.print(p.getFName() + " " + p.getSurname() + "Cannot be captain and crew");
			}
			else{
				captain = p;
			}
		}
		
	}
	public boolean hasPeople(){
		if (crew.size()>0||owner.size()>0||captain != null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setName(String string) {
		
		this.name = string;
	}

	public String getName() {
		
		return this.name;
	}

	public void setOrigin(String string) {
		
		this.countryOfOrigin = string;
	}

	public String getOrigin() {
		
		return countryOfOrigin;
	}

	public void setSize(int size) {
		
		this.size = size;
	}

	public float getSize() {
		
		return size;
	}

	
	public void setMastHeight(int i){
		this.mastHeight = i;
	}
	public int getMastHeight(){
		return mastHeight;
	}
	
	public void setNeedsRepairs(boolean b){
		this.needsRepairs = b;
	}
	public boolean getNeedsRepairs(){
		return needsRepairs;
	}
	
	@Override
	
	public int getSpeed() {
		
		return speed;
	}
	
	//forwards

	@Override
	public void accelerate() {
		this.speed = speed+10;
		
	}
	
	//backwards

	@Override
	public void decelerate() {
		// TODO Auto-generated method stub
		this.speed = speed-10;
	}

	
	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	
}

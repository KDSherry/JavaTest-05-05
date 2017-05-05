package javatestpackage;

public class Boat implements Vehicle{
	//Attributes
	private String name;
	private String countryOfOrigin;
	private String size;
	
	//speed initialised at rest
	private int speed = 0;
	
	//constructor
	public Boat(String name, String countryOfOrigin, String size){
		this.name = name;
		this.countryOfOrigin = countryOfOrigin;
		this.size = size;
	}

	public void setName(String string) {
		
		this.name = string;
	}

	public Object getName() {
		
		return this.name;
	}

	public void setOrigin(String string) {
		
		this.countryOfOrigin = string;
	}

	public Object getOrigin() {
		
		return countryOfOrigin;
	}

	public void setSize(String string) {
		
		this.size = string;
	}

	public Object getSize() {
		
		return size;
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
	
	
}

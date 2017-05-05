package javatestpackage;

public class Marina {
	//Attributes
	private String location;
	private int sBoatCap;
	private int mBoatCap;
	private int lBoatCap;
	
	//other requirements
	private int maxMastHeight;
	private boolean hasRepairs;
	
	//Constructor
	public Marina(String location, int sBoats, int mBoats, int lBoats){
		this.location = location;
		this.sBoatCap = sBoats;
		this.mBoatCap = mBoats;
		this.lBoatCap = lBoats;
	}
	
	public Marina(String location, int sBoats, int mBoats, int lBoats, int maxMastHeight, boolean hasRepairs){
		this.location = location;
		this.sBoatCap = sBoats;
		this.mBoatCap = mBoats;
		this.lBoatCap = lBoats;
		this.maxMastHeight = maxMastHeight;
		this.hasRepairs = hasRepairs;
	}

	public void setLocation(String string) {
		
		this.location = string;
	}

	public Object getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	public void setSmallCap(int i) {
		// TODO Auto-generated method stub
		this.sBoatCap = i;
	}

	public Object getSmallCap() {
		// TODO Auto-generated method stub
		return sBoatCap;
	}

	public void setMedCap(int i) {
		// TODO Auto-generated method stub
		this.mBoatCap = i;
	}

	public Object getMedCap() {
		// TODO Auto-generated method stub
		return mBoatCap;
	}

	public void setLargeCap(int i) {
		// TODO Auto-generated method stub
		this.lBoatCap = i;
	}

	public Object getLargeCap() {
		// TODO Auto-generated method stub
		return lBoatCap;
	}

	public void setMaxMastHeight(int i) {
		// TODO Auto-generated method stub
		this.maxMastHeight = i;
	}

	public Object getMaxMastHeight() {
		// TODO Auto-generated method stub
		return maxMastHeight;
	}

	public void setHasRepairs(boolean b) {
		// TODO Auto-generated method stub
		this.hasRepairs = b;
	}

	public Object getHasRepairs() {
		// TODO Auto-generated method stub
		return hasRepairs;
	}
	
}

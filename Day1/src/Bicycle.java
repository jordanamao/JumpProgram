
class Bicycle {
	
	//Date Member
	private String ownerName;
	
	//Constructor: Initializes the data member;
	public void Bicycle() {
		ownerName = "Unknown";
		
	}
	
	//Returns the name of this bicycle's owner
	public String getOwnerName() {
		
		return ownerName;
	}
	
	//Assign the name of this bicycle's owner
	public void setOwnerName(String name) {
		ownerName = name;
	}

}

package Directory;


public class SchoolType implements Cloneable {
	
	private String type;
	private String duration;
	
	
	public SchoolType() {
		
	
	}
	
	
	@Override
	public String toString() {
		return "SchoolType [type=" + type + ", duration=" + duration + "]";
	}

	public SchoolType(SchoolType schoolType) {
		
		this.setType(schoolType.getType());
		this.setDuration(schoolType.getDuration());
		
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{	
		return super.clone();
		
	}
	
	

}

package Directory;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private Date dob;
	private SchoolType schoolType;
	
	
	
	

	
	
	public SchoolType getSchoolType() {
		return schoolType;
	}

	public void setSchooltype(SchoolType schoolType) {
		this.schoolType = schoolType;
	}

	
	public String getName() {
		
		return this.name = name;
	}
	public void setName(String name) {
		
		this.name =name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		
		Student student = (Student) super.clone();
		
		SchoolType schoolType = (SchoolType) student.getSchoolType().clone();
		student.setSchooltype(schoolType);
		return student;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", schoolType=" + schoolType + "]";
	}
	
	
	
	
}
	

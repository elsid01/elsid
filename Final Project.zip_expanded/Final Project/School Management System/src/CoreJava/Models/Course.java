package CoreJava.Models;


public class Course {

	private int ID;
	private String name;
	private String instructor;

	public Course() {

	}
	public Course(int id,String nm, String ins) {
		this.ID=id;
		this.name=nm;
		this.instructor=ins;
	}

	public void setID(int ID){
		this.ID=ID;
	}

	public int getID(){
		return ID;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setInstructor(String instructor){
		this.instructor=instructor;
	}

	public String getInstructor(){
		return instructor;
	}

}

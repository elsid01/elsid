package CoreJava.Models;

public class Attending {
	private int courseID;
	private String  studentEmail;







	public Attending() {

	}
	public Attending(int ci, String em ) {
		this.courseID=ci;
		this.studentEmail=em;

	}
	public void setCourseID(int courseID){
		this.courseID=courseID;
	}

	public int getCourseID(){
		return courseID;
	}

	public void setStudentEmail(String studentEmail){
		this.studentEmail=studentEmail;
	}

	public String getStudentEmail(){
		return studentEmail;
	}
}

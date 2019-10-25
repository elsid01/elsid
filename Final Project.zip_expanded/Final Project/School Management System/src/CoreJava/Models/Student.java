package CoreJava.Models;

public class Student {
	private String email;
	private String name;
	private String pass;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String em, String am, String ap ) {
		this.email=em;
		this.name= am;
		this.pass=ap;
	}
	public void setEmail(String email){
		this.email= email;
	}

	public String getEmail(){
		return email;
	}

	public void setName(String name){
		this.name= name;
	}

	public String getName(){
		return name;
	}

	public void setPass(String pass){
		this.pass=pass;
	}

	public String getPass(){
		return pass;
	}
}

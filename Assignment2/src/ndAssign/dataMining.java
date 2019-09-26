package ndAssign;
import java.util.Scanner;
public class dataMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner	type = new Scanner(System.in);
	    
	    System.out.println("Please enter the following information so i can sell it for a profit ! ");
	    
	    String fname, lname, login;
	    int grade, id;
	    double gpa;
	    
	    System.out.println("What's your first name ?");
	    
	    fname = type.next();
	    
	    System.out.println("And your last name ? ");
	    
	    lname = type.next();
	    
	    System.out.println("Please tell us your grade");
	    
	    grade = type.nextInt();
	    
	    System.out.println(" How about your ID ?");
	    
	    id = type.nextInt();
	    
	    System.out.println(" your login id ?");
	    
	    login = type.next();
	    
	    System.out.println("And lastly your GPA? ");
	    
	    gpa= type.nextDouble();
	    
	    System.out.println(" Your information : \n Login: " + login + " \n I/D: " + id + " \n Name : " 
	    		+ fname + " " + lname + "\n GPA : " + gpa + "\n Grade : " + grade );
	    
	    

	}

}

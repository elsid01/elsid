package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

    public List<Attending> getAttending(){
		List<Attending> attendingList = new ArrayList<Attending>();

		try {
			File file = new File(".\\Final Project\\School Management System\\src\\attending.csv");
			Scanner type = new Scanner(file);
			//ArrayList<String[]> data = new ArrayList<String[]>();
			while(type.hasNext()) {
				Attending attending = new Attending();
				String[] readString = type.nextLine().split(" , ");

				attending.setCourseID(Integer.parseInt(readString[0]));
				attending.setStudentEmail(readString[1]);
				attendingList.add(attending);
			}
			//close scanner
			type.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!?!");
			e.printStackTrace();
		}
		return attendingList;

    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	for(Attending attendingStudent : attending) {
			if(attendingStudent.getStudentEmail().equals(studentEmail) && attendingStudent.getCourseID() == courseID) {
				return ;
			}
		}
    	Attending attendingStudent = new Attending();
    	attendingStudent.setCourseID(courseID);
    	attendingStudent.setStudentEmail(studentEmail);
    	attending.add(attendingStudent);
    	saveAttending(attending);
    	
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){

    }

    public void saveAttending(List<Attending> attending){

    }

}

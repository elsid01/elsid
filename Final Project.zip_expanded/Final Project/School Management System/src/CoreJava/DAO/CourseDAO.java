package CoreJava.DAO;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
    public List<Course> getAllCourses(){
		List<Course> courseList = new ArrayList<Course>();

		try {
			File file = new File(".\\Final Project\\School Management System\\src\\course.csv");
			Scanner type = new Scanner(file);
			//ArrayList<String[]> data = new ArrayList<String[]>();
			while(type.hasNext()) {
				Course course = new Course();
				String[] readString = type.nextLine().split(" , ");

				course.setID(Integer.parseInt(readString[0]));
				course.setName(readString[1]);
				course.setInstructor(readString[2]);
				courseList.add(course);
			}
			//close scanner
			type.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!?!");
			e.printStackTrace();
		}
		return courseList;
    }
}

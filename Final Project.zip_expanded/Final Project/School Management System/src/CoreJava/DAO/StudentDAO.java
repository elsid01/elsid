package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class StudentDAO {

	public List<Student>  getStudents(){
		List<Student> studentList = new ArrayList<Student>();
		try {
			File file = new File(".\\Final Project\\School Management System\\src\\students.csv");
			Scanner type = new Scanner(file);
			//ArrayList<String[]> data = new ArrayList<String[]>();
			while(type.hasNext()) {
				Student student = new Student();
				String[] readString = type.nextLine().split(" , ");

				student.setEmail(readString[0]);
				student.setName(readString[1]);
				student.setPass(readString[2]);
				studentList.add(student);
			}
			//close scanner
			type.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!?!");
			e.printStackTrace();
		}
		return studentList;
	}

	public Student getStudentByEmail(List<Student> studentList, String studentEmail){
		/* This method takes a Student’s email as a
		 *  String and the List of Students as an 
		 * ArrayList and parses the List for a Student
		 *  with that email and returns a Student 
		 * Object.
		 */
		for(Student student: studentList) {
			if(student.getEmail().equals(studentEmail)) {
				return student;
			}
		}
		return null;
	}

	public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
		for(Student student: studentList) {
			if(student.getEmail().equals(studentEmail) && student.getPass().equals(studentPass)) {
				return true;	
			}
		}
		return false;
	}







}

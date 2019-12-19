package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Student;
import appDAO.CourseDAO;

import appDAO.studentDAO;

public class MainAplication {

	public static void main(String[] args) throws IOException {
		Scanner scanner =new Scanner(System.in);
		
		//MENU
		System.out.println("[1] Create Course");
		System.out.println("[2] Enter students'grade per Course");
		System.out.println("[1] Show Course's average grade");
		System.out.println("[1] Show Course's minimum and maximum grades");
		
		//Menu choice
		int answer = scanner.nextInt();
		
		//choice #1 courses
		if(answer==1) {
			
			//Create individual course file
			CourseDAO courseDAO = new CourseDAO();
			System.out.println("Enter course name");
			String filename = scanner.nextLine();
			courseDAO.courseFile(filename);
			
			//Fill up the file
			courseDAO.WriteOnFile(filename);
			}

			
		}
		
		// choice #2 to enter students'grade
		
		
		// choice #2 to Show Course's average grade
		
		// choice # to Show Course's minimum and maximum grades

	}



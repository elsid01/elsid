package appDAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Student;
 

public class studentDAO {
	
   Scanner scanner = new Scanner(System.in);
	
public ArrayList<Student> Students() throws IOException{
	
	
	ArrayList<Student> studentArray= new ArrayList<Student>();
	
	try {
		File file = new File("/Users/elsid01/eclipse-workspace/gradeanalysisapplication/mathematics.pdf");
		Scanner type = new Scanner(file);
		while(type.hasNext()) {
			Student student = new Student();
			
			String[] readString = type.nextLine().split(",");

			student.setStudentId(Integer.parseInt(readString[0]));
			student.setStudentName(readString[1]);
			student.setStudentEmail(readString[2]);
			studentArray.add(student);
		}
		//close scanner
		type.close();
	} catch (FileNotFoundException e) {
		System.out.println("File not found!!?!");
		e.printStackTrace();
	}
	return studentArray;
}
	
	
	
}


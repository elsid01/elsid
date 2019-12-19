package appDAO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Model.Student;

public class CourseDAO {
	Scanner scanner = new Scanner(System.in);

	//Create course file
	public File courseFile(String filename) throws IOException {
		//Create file
		
		String fileName=scanner.nextLine();
		
		String pathname="/Users/elsid01/eclipse-workspace/newgradeanalysisapplication/src/courseFiles/"+fileName+".txt";
		
		File file = new File(pathname);
		
		file.createNewFile();
		
		
		
		return file;
	}
	//Write on courseFile
	public void WriteOnFile(String fileName) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		
		//Fill up the file
		System.out.println("Enter the number of students attending your course");
		int studentNumber = scanner.nextInt();
		for(int i=1; i<=studentNumber; i++) {
			//StudentDAO studentDAO =new StudentDAO();
			
			Student student = new Student();
			System.out.println("Info for student number: #" + i);

			System.out.println("Enter students'id:");
			student.setStudentId(scanner.nextInt());
			writer.write(student.getStudentId());
			scanner.nextLine();

			System.out.println("Enter students'name:");
			student.setStudentName(scanner.nextLine());
			writer.write(student.getStudentName());

			System.out.println("Enter students'email:");
			student.setStudentEmail(scanner.nextLine());
			writer.write(student.getStudentEmail());
		}
		
	}
	
	
}

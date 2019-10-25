package CoreJava.MainEntryPoint;

import java.awt.List;
import java.util.ArrayList;
import CoreJava.Models.Student;
import CoreJava.DAO.StudentDAO;

public class TestRunner {
    public static void main(String[] args) {
        StudentDAO s1 =new StudentDAO();
        ArrayList<Student> list=new ArrayList<Student>();
        list=(ArrayList<Student>) s1.getStudents();
        //System.out.println(list);
    }
}

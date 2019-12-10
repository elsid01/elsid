package com.elsid01.project2.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBtest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println("DB Tester");
		
		mariaDBconection();
	
	
	
	
	
	}

	public static void mariaDBconection() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb01","root","");
		if(connection.isValid(0)) {
			System.out.println("YES, I'AM CONNECTED TO MARIADB SAMPLE01");
		}else {
			System.out.println("NO");
		}
		
		
	}

}


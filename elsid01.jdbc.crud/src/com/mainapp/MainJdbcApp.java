package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.models.UsersProfile;

public class MainJdbcApp {
	//connect
	static	Connection dbcon ;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//connect to data base
		connectDB();
		//Menu
		crudOperation();
		//Close Data base
		closeDBConnection();
	}

	private static void connectDB() throws ClassNotFoundException, SQLException {
		//register jdbc connector
		Class.forName("org.mariadb.jdbc.Driver");
		//connect
		dbcon = DriverManager.getConnection("jdbc:mariadb://localhost:3306/samplejdbccrud","root","");

		if(dbcon.isValid(0)) {
			System.out.println("CONNECTION IS READY");

		}

	}
	private static void crudOperation() throws SQLException {
		//createUser();
		removeUser();
		editUser();
		showUser();
		showUser();

	}
	
	

	private static void showUser() {
		
		
	}

	private static void editUser() {
		//get user id of the user to edit
		UsersProfile userProfilecurrent = new UsersProfile();
		userProfilecurrent.setUserId(1);
		//show user
		
		
		//get the new infor
		UsersProfile userProfileUpdated = new UsersProfile(4,"xxfname","xxLastname", "aaemail", "aaauserName","aaapasword");
		//update the all record with
		updateUser(userProfileUpdated);
	}

	private static void updateUser(UsersProfile userProfileUpdated) throws SQLException {
		Statement som = dbcon.createStatement();
		
		String sql = "UPDATE usersProfile SET "
				+ "firstName='a',"
				+ "lastName='b',"
				+" email='c' ,"
				+ "userName='d',"
				+" PASSWORD ='e' WHERE userId=2";
;
		som.executeUpdate(sql);
	}

	private static void removeUser() throws SQLException {
		//get userId 
		UsersProfile userProfile= new UsersProfile();
		userProfile.setUserId(1);
		//show user account 
		//Delete user account
		deleteUser(userProfile);
	}

	private static void deleteUser(UsersProfile userProfile) throws SQLException {
		java.sql.Statement som =  dbcon.createStatement();
		String userSqlDelete = "DELETE FROM usersprofile WHERE userId=1";
		
		som.executeUpdate(userSqlDelete);
		
		
		
	}

	private static void createUser() throws SQLException {
		
		//get data/user from the entry page
		UsersProfile userProfile = new UsersProfile(1,"aafname","aaLastname", "aaaemail", "aaauserName","aaapasword");
		
		//Transaction :insert or save the data/user into the table
		//1. create statement
		java.sql.Statement som =  dbcon.createStatement();
		//2.execute query
		String sqlm ="INSERT INTO usersprofile VALUES(2 , 'aafname','aaLastname', 'aaaemail', 'aaauserName','aaapasword')"; 
				
		String sqlm1="INSERT INTO usersprofile VALUES("
		+ userProfile.getUserId()
		+ "','"+userProfile.getFirstName()
		+"','"+userProfile.getLastName()
		+"','"+userProfile.getEmail()
		+"','"+userProfile.getUserId()
		+"','"+userProfile.getPassword() 
		+"')";
		
		som.executeUpdate(sqlm);
		
		
		
		
		int resultFlag = som.executeUpdate(sqlm);
		if(resultFlag==1) {
			System.out.println("user successfully created");
		}else {
			System.out.println("ERROR Try again....invalid..data ");
		}
		     //veriry if the insert succeed
		
	}

	private static void closeDBConnection() throws SQLException {
		dbcon.close();
	}

}

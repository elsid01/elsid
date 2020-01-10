package com.services;

import java.sql.SQLException;

import com.DAO.UsersProfileDAO;
import com.models.UsersProfile;

public class UsersServices {
	//create 
	//this method will be invoked from the springMVC controller
	public void creatUser(UsersProfile user) throws ClassNotFoundException, SQLException {
		//Include the business logic for your application class
		UsersProfileDAO usersProfileDAO = new UsersProfileDAO();
	    int resultFlag = usersProfileDAO.insertUser(user);
	    if(resultFlag==1) {
	    	System.out.println("GREAT");
	    }else {
	    	System.out.println("ERROR: NOT GOOD");
	    }
	}
	//remove
public void removeUser() {
		
	}
	//edit
public void editUser(UsersProfile user) throws ClassNotFoundException, SQLException {
	
	//here the business logic 
		UsersProfileDAO usersProfileDAO = new UsersProfileDAO();
	    int resultFlag = usersProfileDAO.updateUser(user);
	    if(resultFlag==1) {
	    	System.out.println("GREAT");
	    }else {
	    	System.out.println("ERROR: NOT GOOD");
	    }
	//when 
	
}
	//show
public void showUser() {
	
}
	//showAll
public void showAllUser() {
	
}
}

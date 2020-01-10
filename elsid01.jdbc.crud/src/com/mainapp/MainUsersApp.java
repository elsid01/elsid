package com.mainapp;

import java.sql.SQLException;

import com.models.UsersProfile;
import com.services.UsersServices;

public class MainUsersApp {
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		handlePageNewUser();
		//handlePageEditUser();
		//handlPageRemoveUser();
		//handlePageNewUser();
		//handlePageShowAllUser();
		
	
	}

	

	private static void handlePageEditUser() throws ClassNotFoundException, SQLException {
		
		UsersProfile userUpdated= new UsersProfile();
		userUpdated.setUserId(102);
		userUpdated.setFirstName("BfirstName");
        userUpdated.setLastName("BlastName");
        userUpdated.setEmail("Bemail");
        userUpdated.setUserName("BuserName");
        userUpdated.setPassword("Bpassword");				
        
        
        UsersServices usersServices = new UsersServices ();
		usersServices.editUser(userUpdated);
		
	}



	private static void handlePageShowAllUser() {
		// TODO Auto-generated method stub
		
	}

	private static void handlPageRemoveUser() {
		// TODO Auto-generated method stub
		
	}

	private static void handlePageNewUser() throws ClassNotFoundException, SQLException {
		UsersServices usersServices= new UsersServices();
		UsersProfile user= new UsersProfile();
		user.setUserId(100);
		user.setFirstName("BfirstName");
        user.setLastName("BlastName");
        user.setEmail("Bemail");
        user.setUserName("BuserName");
        user.setPassword("Bpassword");				
        
		usersServices.creatUser(user);
		
	}

}

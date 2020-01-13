package elsid01.jpa.crud.app.services;

import java.sql.SQLException;

import elsid01.jpa.crud.app.dao.UserProfileDAO;
import elsid01.jpa.crud.app.entities.UserProfile;

public class UserServices {
public void createUser(UserProfile user) throws ClassNotFoundException, SQLException {
	 int result = 0;
	UserProfileDAO userDAO = new UserProfileDAO();
	result = userDAO.insertUser(user);
	if(result==1) {
		System.out.println("Do More here");
		System.out.println("Congrats User saved");
		
	}else {
		System.out.println("Do More here");
		System.out.println("It Fail");
	}
	
}
}

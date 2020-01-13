package elsid01.jpa.crud.appMain;

import java.sql.SQLException;

import elsid01.jpa.crud.app.dao.UserProfileDAO;
import elsid01.jpa.crud.app.entities.UserProfile;
import elsid01.jpa.crud.app.services.UserServices;

public class MainAppliction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserServices userService = new UserServices();
		
		userService.createUser(new UserProfile(10,"samba","aliou","@samba","sambaAliou","2345aliou"));

	}

}

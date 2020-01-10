package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.models.UsersProfile;

public class UsersProfileDAO implements usersProfileInterface {


	public int insertUser(UsersProfile user) throws SQLException, ClassNotFoundException {
		//register jdbc connector
		Class.forName("org.mariadb.jdbc.Driver");
		//connect
		Connection	dbcon = DriverManager.getConnection("jdbc:mariadb://localhost:3306/samplejdbccrud","root","");
		//1. create statement
		java.sql.Statement som =  dbcon.createStatement();
		String sqlm ="INSERT INTO usersprofile VALUES(1 , 'aafname','aaLastname', 'aaaemail', 'aaauserName','aaapasword')"; 
		String sqlm1="INSERT INTO usersprofile VALUES("
				+ user.getUserId()
				+ "','"+user.getFirstName()
				+"','"+user.getLastName()
				+"','"+user.getEmail()
				+"','"+user.getUserId()
				+"','"+user.getPassword() 
				+"')";		
		int resultFlag = som.executeUpdate(sqlm);
		
		//close
				som.close();
			
				dbcon.close();
		
		

		return resultFlag;
	}




	@Override
	public int deleteUserById(int userId) throws ClassNotFoundException, SQLException {
		//connection 
		Class.forName("org.mariadb.jdbc.Driver");
		Connection	dbcon = DriverManager.getConnection("jdbc:mariadb://localhost:3306/samplejdbccrud","root","");

		//query
		java.sql.Statement som =  dbcon.createStatement();
		String userSqlDelete = "DELETE FROM usersprofile WHERE userId=1";

		som.executeUpdate(userSqlDelete);

		//close connection
		
				som.close();
				
				dbcon.close();
		return 0;
	}

	@Override
	public int updateUser(UsersProfile user) throws ClassNotFoundException, SQLException {
		//connect 
		Class.forName("org.mariadb.jdbc.Driver");
		Connection	dbcon = DriverManager.getConnection("jdbc:mariadb://localhost:3306/samplejdbccrud","root","");
		//query
		Statement som = dbcon.createStatement();
		String sql = "UPDATE usersprofile SET "

				+ "firstName= '"+user.getFirstName()
				+ "', lastName= '"+user.getLastName()
				+"', email = '"+user.getEmail()
				+"', userName= '"+user.getUserId()
				+"', password = '"+user.getPassword()
				+"' WHERE userId= " + user.getUserId();

		som.executeUpdate(sql);	

		//close
				som.close();
				
				dbcon.close();
		return 0;
	}

	@Override
	public UsersProfile getUserById(int userId) throws ClassNotFoundException, SQLException {
		//connection 
		Class.forName("org.mariadb.jdbc.Driver");
		Connection	dbcon = DriverManager.getConnection("jdbc:mariadb://localhost:3306/samplejdbccrud","root","");
		//execute
		java.sql.Statement som =  dbcon.createStatement();
		String sqlQuery="SELECT* FROM usersProfile WHERE userId = " + userId;
		ResultSet rs= som.executeQuery(sqlQuery);
		//get the record from  ResultSet
		UsersProfile user= new UsersProfile();

		if (rs.next()) {//record exist or record found
			user.setUserId(userId);
			user.setFirstName(rs.getString(2));
			user.setLastName(rs.getString(3));
			user.setEmail(rs.getString(4));
			user.setUserName(rs.getString(5));
			user.setPassword(rs.getString(6));

		}else {//record not found
			user=null;
		}
		//close
				som.close();
				rs.close();
				dbcon.close();

		return null;
	}

	@Override
	public ArrayList<UsersProfile> getAllUser() throws SQLException, ClassNotFoundException {

		//declare the arrayList
		ArrayList<UsersProfile> usersList = new ArrayList<UsersProfile>();

		//connection 
		Class.forName("org.mariadb.jdbc.Driver");
		Connection	dbcon = DriverManager.getConnection("jdbc:mariadb://localhost:3306/samplejdbccrud","root","");
		//execute
		java.sql.Statement som =  dbcon.createStatement();
		String sqlQuery="SELECT* FROM usersProfile " ;
		ResultSet rs= som.executeQuery(sqlQuery);
		//add all   ResultSet row to the arrayList

		UsersProfile user;

		while (rs.next()) {//record exist or record found
			user= new UsersProfile();
			//setters
			user.setUserId(rs.getInt(1));
			user.setFirstName(rs.getString(2));
			user.setLastName(rs.getString(3));
			user.setEmail(rs.getString(4));
			user.setUserName(rs.getString(5));
			user.setPassword(rs.getString(6));

			
			usersList.add(user);
		}
		
		//close
		som.close();
		rs.close();
		dbcon.close();
		return usersList;
	}

}

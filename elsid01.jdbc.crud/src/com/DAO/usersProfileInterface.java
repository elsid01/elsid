package com.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import com.models.UsersProfile;

public interface usersProfileInterface {
/*
 * 	return type are 0 means fail 1 or 
 * greater than one means succeed and
 *   represents the number of row affected
 */
public int insertUser(UsersProfile user) throws SQLException, ClassNotFoundException;

public int deleteUserById(int userId) throws ClassNotFoundException, SQLException;//document values : return and parameter

public int updateUser(UsersProfile user) throws ClassNotFoundException, SQLException;

public UsersProfile getUserById(int userId) throws ClassNotFoundException, SQLException;

public ArrayList<UsersProfile> getAllUser() throws SQLException, ClassNotFoundException;

}

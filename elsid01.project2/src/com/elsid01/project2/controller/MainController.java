package com.elsid01.project2.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elsid01.project2.connection.DBtest;

/*
 * @Author
 * @Date
 * @Name:MainController
 * This the name of my web application
 * it will include the handles for the main 
 * navigation menu
 */
@Controller
public class MainController{
	
//Home page handle method
@RequestMapping("") //"" ==> home page of the application	
public String showHome() throws SQLException, ClassNotFoundException {
	
	DBtest test= new DBtest();
	test.mariaDBconection();
	
	String pageName= "index";
	return pageName;
}

@RequestMapping("/register")
public String showRegister() {
	return "register";
}

@RequestMapping("/business")
public String showBusiness() {
	return "business";
}
@RequestMapping("/contact")
public String showContactus() {
	return "contact";
}
@RequestMapping("/about")
public String showAbout() {
	return "about";
}
@RequestMapping("/login")
public String showLOGIN() {
	return "login";
}







}

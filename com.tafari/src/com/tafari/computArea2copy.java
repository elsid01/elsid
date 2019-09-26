

package com.tafari;
import java.util.Scanner;
public class computArea2copy {
	
	public static void main(String[] args) {
	
double radius;
double area;
Scanner input =new Scanner(System.in);
System.out.println("Enter a area you like:");
// Assign a radius
 
 radius= input.nextDouble();
//compute area
area=radius*radius*3.14159;
//Display result
System.out.println("The area for the of radius " + radius + " is " + area);
input.close();
	}

}

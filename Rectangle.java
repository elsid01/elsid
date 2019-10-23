package sbaweekfiveandsix;

import java.awt.datatransfer.FlavorTable;

//Implements the Shape interface 
public class Rectangle implements Shape  {
	//Class variable
	float length;
	float width;
	
	 
	
    //Methods
    public  Rectangle (float new_length, float new_width) {
		this.length=new_length;
		this.width= new_width;
	}
  //Methods from Shape interface
    public float getArea() {
    	float area = this.length*this.width;
    	System.out.println("Finding the area of the rectangle length = " + this.length + "and width"+
    	                   this.width + "= " + area);
    	return area;
    }
    
    public float getPerimeter() {
		float perimeter = 2*(this.length + this.width);
    	return perimeter;
	}
    
    public  String toString() {
    	
    	return ("Rectangle = length: " + this.length + ", " +
    	                     "width: " + this.width + ", area :"+ getArea()+ 
    	                     ", perimeter:" + getPerimeter() );
		
    };
    
    
    
    
    
    
    
    
    
    
    
}

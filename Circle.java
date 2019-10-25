package sbafivelastSba;

public class Circle implements ShapeA{
	
	//Class variables
	float radius;
	
	//Method of class circle
	 Circle(float new_radius) {
		this.radius = new_radius;
		
		
	}
	
	//Methods from ShapeA
	public float getArea() {
		System.out.println("Finding area of the circle with radius = " + radius);
		return (float) (3.14*radius*radius);
		
	};
	
    public float getPerimeter() {
    	System.out.println("Finding the perimeter with radius = " + radius );
    	return (float) (6.28*radius);
    };
	 
    public String toString() {
    	return "Circle = radius :" + radius + ", area : " + getArea() +
    			", perimeter: " + getPerimeter();
    };
}

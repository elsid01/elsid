package sbafivelastSba;

import java.awt.geom.Area;



public class Square extends Rectangle {
	private float side;
	public Square(float new_length, float new_width) {
		super(new_length, new_width);

	}

	public Square(float side) {
		this.length= side;
		this.length=this.width;
	}

	public float getArea(float side) {


		float area = side*side;
		System.out.println("Finding area of square with side = " + side);
		return area;
	}

	public float getPerimeter(float side) {

		float perimeter = side*4;

		System.out.println("Finding perimeter of square with side = " + side );
		return perimeter;

	}

	public String tosString() {
		return ("Square =  side :" + side + " , area:" + getArea(side)+
				", perimeter: "+ getPerimeter(side) );
	}










}

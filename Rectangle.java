package sbafivelastSba;

public class Rectangle implements ShapeA  {
	//Class variable
	float length;
	float width;



	//Methods
	Rectangle (float new_length, float new_width) {
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
		System.out.println("Finding the perimeter of the rectangle length = " + this.length + "and width"+
				this.width + "= " + perimeter);
		return perimeter;
	}

	public  String toString() {

		return ("Rectangle = length: " + this.length + ", " +
				"width: " + this.width + ", area :"+ getArea()+ 
				", perimeter:" + getPerimeter() );
	}
}
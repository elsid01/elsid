package sbaweekfiveandsix;


//Inherit the rectangle class
public class Scare extends Rectangle {

	
    
    
	float side;
    public void setSide() {
		this.length= side;
		this.width= side;
	}
    
    
    public Scare(float new_length, float new_width) {
		super(new_length, new_width);
		
	}

}

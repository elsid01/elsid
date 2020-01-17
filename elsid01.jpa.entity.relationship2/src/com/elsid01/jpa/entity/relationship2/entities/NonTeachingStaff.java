package com.elsid01.jpa.entity.relationship2.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff{


	private String areaExpertise;

	
	
	//constructor
	public NonTeachingStaff(int sid, String sname, String areaExpertise) {
		super(sid, sname);
		this.areaExpertise = areaExpertise;
	}

	

	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NonTeachingStaff(int sid, String sname) {
		super(sid, sname);
		// TODO Auto-generated constructor stub
	}

//Getters and setters
	public String getAreaExpertise() {
		return areaExpertise;
	}



	


	public void setAreaExpertise(String areaExpertise) {
		this.areaExpertise = areaExpertise;
	}
	
	

}

package com.elsid01.jpa.entity.relationship2.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Staff {


	

	private String qualification;
	private String subjectExpertise;

	//constructor
	public TeachingStaff(int sid, String sname, String qualification, String subjectExpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
	}

	public TeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TeachingStaff(int sid, String sname) {
		super(sid, sname);
		// TODO Auto-generated constructor stub
	}

	//Getters and setters
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectExpertise() {
		return subjectExpertise;
	}

	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}




}

package com.elsid01.jpa.entity.relationship2.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Staff {
	



	@Id
	@Column
	private int sid;
	@Basic
	@Column
	private String sname;



	//Constructors

	public Staff(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	public Staff() {
		super();
		
	}


	//Getters and setters
	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



}

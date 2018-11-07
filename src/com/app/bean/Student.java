package com.app.bean;

public class Student {

	private String name;
	private String gender;
	private int univ_num;
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getUniv_num() {
		return univ_num;
	}
	
	public Student( String name, String gender, int univ_num) {
		super();
		this.name = name;
		this.gender = gender;
		this.univ_num = univ_num;
	}
	
	
}

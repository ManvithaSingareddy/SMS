package com.example.SMS.Entity;

public class Student {
	
	private int studentId;
	private String studentFirstName;
	private String studentSurName;
	private String gender;
	
	
	public Student(int studentId, String studentFirstName, String studentSurName, String gender) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentSurName = studentSurName;
		this.gender = gender;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentSurName() {
		return studentSurName;
	}
	public void setStudentSurName(String studentSurName) {
		this.studentSurName = studentSurName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}

package com.spring.Basics.Injections;

public class StudentInfo {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentInfo [student=" + student + "]";
	}
	
	
	
	
}

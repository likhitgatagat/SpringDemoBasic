package com.likhit.entity;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
	private String firstName;
	private String lastName;
	private String grade;
	private Address address;
	private Set<Subject> subjects;
	private Map<String, String> teachers;
	
	public Map<String, String> getTeachers() {
		return teachers;
	}

	public void setTeachers(Map<String, String> teachers) {
		this.teachers = teachers;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return firstName + ", " + lastName + ", " + grade;
	}
	
	public void printTeachers() {
		Iterator<Map.Entry<String, String>> itr = teachers.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> currentEntry = itr.next();
			System.out.println(currentEntry.getKey() + ": " + currentEntry.getValue());
 		}
	}
}

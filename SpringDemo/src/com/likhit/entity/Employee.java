package com.likhit.entity;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	String name;
	int salary;
	Address address;
	Set<Skills> empSkills;
	Map<String, String>  projects;
	Map<Skills, SubSkills> employeeSkillDetails;
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int salary, String name, Address addr, Set<Skills> empSkills, Map<String, String> projects, Map<Skills, SubSkills> employeeSkillDetails) {
		this.salary = salary;
		this.name = name;
		this.address = addr;
		this.empSkills = empSkills;
		this.projects = projects;
		this.employeeSkillDetails = employeeSkillDetails;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Set<Skills> getEmpSkills() {
		return empSkills;
	}
	
	public Map<String, String> getProjects() {
		return projects;
	}

	public Map<Skills, SubSkills> getEmployeeSkillDetails() {
		return employeeSkillDetails;
	}

	public void printSkillSet() {
		Iterator<Skills> itr = empSkills.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
	}
	
	public void printProjects() {
		Iterator<String> project = this.getProjects().keySet().iterator();
		while(project.hasNext()) {
			String projectName = project.next();
			System.out.println("Project: " + projectName + ", " + "Domain: " + projects.get(projectName));
		}
	}
	
	public void printDetailedSkillSet() {
		Iterator<Entry<Skills, SubSkills>> details = this.getEmployeeSkillDetails().entrySet().iterator();
		while(details.hasNext()) {
			Entry<Skills, SubSkills> entry = details.next();
			Skills skill = entry.getKey();
			SubSkills subSkills = entry.getValue();
			System.out.println("Skill: " + skill.getName() + ", SubSkills: " + subSkills.getAllSubSkills());
		}
	}
}

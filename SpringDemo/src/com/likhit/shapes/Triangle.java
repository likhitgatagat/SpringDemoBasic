package com.likhit.shapes;

import com.likhit.entity.Shape;

public class Triangle extends Shape {
	private String name;

	public Triangle(String name) {
		super(name);
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

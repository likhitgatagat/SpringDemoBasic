package com.likhit.entity;

public class Skills implements Comparable<Skills>{
	private String name;

	public Skills(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Skills o) {
		return this.name.compareTo(o.name);
	}
	
}

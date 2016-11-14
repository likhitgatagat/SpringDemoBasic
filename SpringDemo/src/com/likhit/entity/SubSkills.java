package com.likhit.entity;

import java.util.Iterator;
import java.util.Set;

public class SubSkills {
	private Set<String> subkill;

	public SubSkills(Set<String> subkill) {
		this.subkill = subkill;
	}

	public Set<String> getSubkill() {
		return subkill;
	}

	public void setSubkill(Set<String> subkill) {
		this.subkill = subkill;
	}
	
	public String getAllSubSkills() {
		Iterator<String> itr = subkill.iterator();
		StringBuilder sb = new StringBuilder();
		while(itr.hasNext()) {
			sb.append(itr.next() + ", ");
		}
		return sb.toString();
	}
}

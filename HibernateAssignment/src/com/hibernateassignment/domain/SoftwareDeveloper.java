package com.hibernateassignment.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class SoftwareDeveloper extends Employee {
	
	@ElementCollection
	private List<String> languages;

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	
}

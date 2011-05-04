package com.hibernateassignment.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class SoftwareDeveloper extends Employee {
	
	@ElementCollection
	private String languages;
	
}

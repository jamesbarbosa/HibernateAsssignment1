package com.hibernateassignment.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Manager extends Employee {

	
	@OneToMany(mappedBy = "teamManager")
	private List<Team> listOfTeams;
	
	public List<Team> getListOfTeams() {
		return listOfTeams;
	}

	public void setListOfTeams(List<Team> listOfTeams) {
		this.listOfTeams = listOfTeams;
	}
	
	
}

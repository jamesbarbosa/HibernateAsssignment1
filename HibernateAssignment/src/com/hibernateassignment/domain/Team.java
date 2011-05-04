package com.hibernateassignment.domain;

import java.util.List;

public class Team {
	private List<Employee> teamMembers;
	private Manager teamManager;

	public List<Employee> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<Employee> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public Manager getTeamManager() {
		return teamManager;
	}

	public void setTeamManager(Manager teamManager) {
		this.teamManager = teamManager;
	}

}

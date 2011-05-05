package com.hibernateassignment.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Team {

	public Team() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teamId;

	public Long getTeamId() {
		return teamId;
	}

	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	private List<Employee> teamMembers;

	@ManyToOne
	@JoinTable(name = "manager_team", joinColumns = @JoinColumn(name = "team_id"), 
			                   inverseJoinColumns = @JoinColumn(name = "manager_id"))
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

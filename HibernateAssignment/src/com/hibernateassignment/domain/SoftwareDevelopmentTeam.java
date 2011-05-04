package com.hibernateassignment.domain;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class SoftwareDevelopmentTeam {

	private List<SoftwareDeveloper> developers;
	private List<QA> qualityAssurance;
	private Manager softwareDevelopmentManager;
	private SoftwareDeveloper teamLeader;

	public List<SoftwareDeveloper> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<SoftwareDeveloper> developers) {
		this.developers = developers;
	}

	public List<QA> getQualityAssurance() {
		return qualityAssurance;
	}

	public void setQualityAssurance(List<QA> qualityAssurance) {
		this.qualityAssurance = qualityAssurance;
	}

	public Manager getSoftwareDevelopmentManager() {
		return softwareDevelopmentManager;
	}

	public void setSoftwareDevelopmentManager(Manager softwareDevelopmentManager) {
		this.softwareDevelopmentManager = softwareDevelopmentManager;
	}

	public SoftwareDeveloper getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(SoftwareDeveloper teamLeader) {
		this.teamLeader = teamLeader;
	}

}

package com.hibernateassignment.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class SoftwareDevelopmentTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long softwareDevelopmentTeamId;
	
	@Transient
	private List<SoftwareDeveloper> developers;
	@Transient
	private List<QA> qualityAssurance;
	@Transient
	private Manager softwareDevelopmentManager;
	@Transient
	private SoftwareDeveloper teamLeader;
	
	public Long getSoftwareDevelopmentTeamId() {
		return softwareDevelopmentTeamId;
	}
	
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

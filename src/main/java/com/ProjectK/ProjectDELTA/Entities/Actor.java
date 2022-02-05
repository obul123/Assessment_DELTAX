package com.ProjectK.ProjectDELTA.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Past;

@Entity
public class Actor {
	
	@Id
	private String actorName;
	private String actorBio;
	@Past
	private Date actor_DOB;
	private String gender;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actor(String actorName, String actorBio, Date actor_DOB, String gender) {
		super();
		this.actorName = actorName;
		this.actorBio = actorBio;
		this.actor_DOB = actor_DOB;
		this.gender = gender;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorBio() {
		return actorBio;
	}
	public void setActorBio(String actorBio) {
		this.actorBio = actorBio;
	}
	public Date getActor_DOB() {
		return actor_DOB;
	}
	public void setActor_DOB(Date actor_DOB) {
		this.actor_DOB = actor_DOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Actor [actorName=" + actorName + ", actorBio=" + actorBio + ", actor_DOB=" + actor_DOB + ", gender="
				+ gender + "]";
	}
	
	

}

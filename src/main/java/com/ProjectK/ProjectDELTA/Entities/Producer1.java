package com.ProjectK.ProjectDELTA.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Past;
@Entity
public class Producer1 {
	
	@Id
	private String producerName;
	private String producerBio;
	private String company;
	@Past
	private Date producer_DOB;
	private String gender;
	public Producer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producer1(String producerName, String producerBio, String company, Date producer_DOB, String gender) {
		super();
		this.producerName = producerName;
		this.producerBio = producerBio;
		this.company = company;
		this.producer_DOB = producer_DOB;
		this.gender = gender;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public String getProducerBio() {
		return producerBio;
	}
	public void setProducerBio(String producerBio) {
		this.producerBio = producerBio;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getProducer_DOB() {
		return producer_DOB;
	}
	public void setProducer_DOB(Date producer_DOB) {
		this.producer_DOB = producer_DOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Producer [producerName=" + producerName + ", producerBio=" + producerBio + ", company=" + company
				+ ", producer_DOB=" + producer_DOB + ", gender=" + gender + "]";
	}
	
	

}

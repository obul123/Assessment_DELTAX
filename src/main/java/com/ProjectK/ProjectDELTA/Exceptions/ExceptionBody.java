package com.ProjectK.ProjectDELTA.Exceptions;

import java.util.Date;

public class ExceptionBody {
	
	private Date timeStamp;
	private String message;
	private String details;
	public ExceptionBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionBody(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ExceptionBody [timeStamp=" + timeStamp + ", message=" + message + ", details=" + details + "]";
	}
	
	

}

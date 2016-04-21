package com.codeclan.mh;

import java.util.Date;

public class Project {

	private String name;
	private double grade;
	private Date SubmissionDate;
	private String Comments;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Date getSubmissionDate() {
		return SubmissionDate;
	}
	public void setSubmissionDate(Date submissionDate) {
		SubmissionDate = submissionDate;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	
	
	
}


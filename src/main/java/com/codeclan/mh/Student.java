package com.codeclan.mh;

import java.util.ArrayList;

public class Student extends User {

	private double overallGrade;
	ArrayList<Project> myProjects;
	
	public Student(){
		super();
		myProjects = new ArrayList<Project>();
	}

	public double getOverallGrade() {
		return overallGrade;
	}

	public void setOverallGrade(double overallGrade) {
		this.overallGrade = overallGrade;
	}
	
	public boolean addProject(Project project){
		return myProjects.add(project);
	}
	public boolean removeProject(Project project){
		return myProjects.remove(project);
	}
	public double calculateGrade(){
		double grade = 0;
		for(int i=0; i < myProjects.size(); i++){
			Project currentProject = myProjects.get(i);
			grade += currentProject.getGrade();
		}
		return grade/myProjects.size();
	}
	

	
}

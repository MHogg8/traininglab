package com.codeclan.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudent {
	
	
	@Test
	public void testSetName(){
		Student Tony = new Student();
		Tony.setName("jim");
		assertTrue(Tony.getName()=="jim");
	}
	
	@Test
	public void testSetLastName(){
		Student Tony = new Student();
		Tony.setLastName("Iommi");
		assertTrue(Tony.getLastName()=="Iommi");
	}
	
	@Test
	public void testSetEmail(){
		Student Tony = new Student();
		Tony.setEmail("tony@tony.com");
		assertTrue(Tony.getEmail()=="tony@tony.com");
	}
	
	@Test
	public void testProjectArray(){
		Student Tony = new Student();
		Project stiff = new Project();
		Tony.addProject(stiff);
		assertTrue(Tony.myProjects.size() == 1);
		
	}
	@Test
	public void testProjectRemoveArray(){
		Student Tony = new Student();
		Project stiff = new Project();
		Project chimp = new Project();
		Tony.addProject(stiff);
		Tony.addProject(chimp);
		Tony.removeProject(chimp);
		assertTrue(Tony.myProjects.size() == 1);
		
	}
	
	

}

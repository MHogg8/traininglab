package com.codeclan.mh;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTutor {
	
	@Test
	public void testSetName(){
		Tutor Jeff = new Tutor();
		Jeff.setName("steve");
		assertTrue(Jeff.getName()=="steve");
	}
	
	@Test
	public void testSetLastName(){
		Tutor Jeff = new Tutor();
		Jeff.setLastName("colins");
		assertTrue(Jeff.getLastName()=="colins");
	}
	
	@Test
	public void testSetEmail(){
		Tutor Jeff = new Tutor();
		Jeff.setEmail("jeff@jeff.com");
		assertTrue(Jeff.getEmail()=="jeff@jeff.com");
	}
	
	@Test
	public void testAddModule(){
		Tutor Jeff = new Tutor();
		Modules History = new Modules();
		Jeff.addModule(History);
		assertTrue(Jeff.modulesTaught.size()==1);
	}

	@Test
	public void testRemoveModule(){
		Tutor Jeff = new Tutor();
		Modules History = new Modules();
		Modules Classics = new Modules();
		Modules Achaemenid = new Modules();
		Modules ClassLit = new Modules();
		Jeff.addModule(History);
		Jeff.addModule(Classics);
		Jeff.addModule(Achaemenid);
		Jeff.addModule(ClassLit);
		Jeff.removeModule(ClassLit);
		Jeff.removeModule(Achaemenid);
		assertTrue(Jeff.modulesTaught.size()==2);
	}

}

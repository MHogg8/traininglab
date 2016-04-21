package com.codeclan.mh;

import java.util.ArrayList;

public class Tutor extends User {

	ArrayList<Modules> modulesTaught;
	
	public Tutor(){
		super();
		modulesTaught = new ArrayList<Modules>();
	}

	public boolean addModule(Modules module){
		return modulesTaught.add(module);
	}
	public boolean removeModule(Modules module){
		return modulesTaught.remove(module);
	}
}

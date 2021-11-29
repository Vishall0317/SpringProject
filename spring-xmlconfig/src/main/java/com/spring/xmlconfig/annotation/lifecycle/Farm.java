package com.spring.xmlconfig.annotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SuppressWarnings("restriction")
public class Farm {
	
	private String type;
	private int duration;
	
	
	public Farm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Farm(String type, int duration) {
		super();
		this.type = type;
		this.duration = duration;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Farm [type=" + type + ", duration=" + duration + "]";
	}
	
	@PostConstruct
	public void hey() {
		System.out.println("inside init method: hey, how are you!");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("inside destroy method: bye bye!");
	}

}

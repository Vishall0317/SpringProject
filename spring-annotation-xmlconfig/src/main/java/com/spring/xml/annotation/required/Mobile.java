package com.spring.xml.annotation.required;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Mobile {

	private String ram;
	private String company;
	private String rom;
	

	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRom() {
		return rom;
	}
	
	@Required
	public void setRom(String rom) {
		this.rom = rom;
	}
	
}

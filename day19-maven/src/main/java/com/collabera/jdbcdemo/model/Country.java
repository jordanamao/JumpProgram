package com.collabera.jdbcdemo.model;

public class Country {

	private String code;
	private String name;
	private String continent;
	private String region;
		

	public Country(String code, String name, String continent, String region) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
	}
	
	
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
}

package com.collabera.jdbcdemo.model;



public class City {
	
	private int id;
	private String name;
	private String district;
	private int population;
	private String countryCode;

	public City() {
		super();
	}

	public City(int id, String name, String district, int population, String countryCode) {
		super();
		this.id = id;
		this.name = name;
		this.district = district;
		this.population = population;
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", district=" + district + ", population=" + population
				+ ", countryCode=" + countryCode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}

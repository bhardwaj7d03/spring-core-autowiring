package com.codesmines111.springcoredemo111;

public class Car {
	private String carname;
	private String carcolor;
	private String carbrand;
	private Engine eng;
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarcolor() {
		return carcolor;
	}
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	public String getCarbrand() {
		return carbrand;
	}
	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}
}
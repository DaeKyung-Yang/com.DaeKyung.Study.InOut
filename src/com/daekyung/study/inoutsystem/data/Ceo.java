package com.daekyung.study.inoutsystem.data;

public class Ceo extends Director{
	
	private String carNumber;
	public Ceo() {
		
	}
	public Ceo(String name, int employeeNumber, String joinData, int roomNumber, String carNumber)
	{
		super(name, employeeNumber, joinData, roomNumber);
		this.setCarNumber(carNumber);
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
}
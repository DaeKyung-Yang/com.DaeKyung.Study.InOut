package com.daekyung.study.inoutsystem.data;

public class Director extends Worker{
	
	private int roomNumber;
	
	public Director() {
		
	}
	public Director(String name, int employeeNumber, String joinData, int roomNumber)
	{
		super(name, employeeNumber, joinData);
		this.setRoomNumber(roomNumber);
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
}

package com.daekyung.study.inoutsystem.data;

public class Worker {
	
	private String name;
	private int employeeNumber;
	private String joinData; 
	
	public Worker(String name, int employeeNumber, String joinData)
	{
		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setJoinData(joinData);
	}

	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getJoinData() {
		return joinData;
	}

	public void setJoinData(String joinData) {
		this.joinData = joinData;
	}
}

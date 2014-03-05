package com.strumsoft.example;

public class EmployeeExample implements Cloneable {
	
	private  String employeeName;
	private String employeeId;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}

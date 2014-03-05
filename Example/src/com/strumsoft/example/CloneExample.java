package com.strumsoft.example;

public class CloneExample {
	
	
	public static void main(String[] args) {
		EmployeeExample employee = new EmployeeExample();
		employee.setEmployeeName("clone example DEMO ;)");
		employee.setEmployeeId("1234");
		
		try {
			EmployeeExample cloneExample =  (EmployeeExample) employee.clone();
			System.out.println("Clone object:"+cloneExample.getEmployeeName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

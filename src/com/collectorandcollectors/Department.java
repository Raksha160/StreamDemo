package com.collectorandcollectors;

public class Department {
	private String departmentName;
	private String location;
	public String getDepartmentName() {
		return departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department(String departmentName, String location) {
		super();
		this.departmentName = departmentName;
		this.location = location;
	}
	public Department(String departmentName2, String location2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", location=" + location + "]";
	}
	

}

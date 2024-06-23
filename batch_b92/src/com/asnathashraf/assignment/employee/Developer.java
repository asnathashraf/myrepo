package com.asnathashraf.assignment.employee;

class Developer extends Employee {
	protected int developerid;

	public int getDeveloperid() {
		return developerid;
	}

	public void setDeveloperid(int developerid) {
		this.developerid = developerid;
	}

	@Override
	public String toString() {
		return "Developer [developerid=" + developerid + ", Name=" + getName() + ", EmployeeId="
				+ getEmployeeId() + ", Salary=" + getSalary() + "]";
	}
	
}

package com.asnathashraf.assignment.employee;
class Manager extends Employee
{
	protected int managerid;

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
				+ ", Salary=" + getSalary() + "]";
	}
	
}

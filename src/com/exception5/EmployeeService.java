package com.exception5;

public class EmployeeService {
	
	public void validateSalary(double salary) 
			throws InvalidSalaryException{
		
		if(salary < 1500) {
			throw new InvalidSalaryException("salary must be at least 15000");
		}
			System.out.println("Employee salary approved");
		}
	

}

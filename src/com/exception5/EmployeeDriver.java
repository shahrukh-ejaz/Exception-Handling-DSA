package com.exception5;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		
		try {
			service.validateSalary(12000);
			
		}catch(InvalidSalaryException e) {
			
			System.out.println("Validation Failed: "+ e.getMessage());
			
		}
		
		System.out.println("Employee verification completed");
	}

}

package com.exception.trywithresource2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeReportWriter {
	
	public static void main(String[] args) {
		
		try(BufferedWriter writer =
			new BufferedWriter(new FileWriter("employee-report.txt"))){
			
			
			writer.write("Employee ID: 101");
			writer.newLine();
			
			writer.write("Employee Name: Shahrukh");
			writer.newLine();
			
			writer.write("Department : Java Backend");
			writer.newLine();
			
			writer.write("Salary: 35000");
			
			System.out.println("Employee report generated");
		}catch(IOException e) {
			System.out.println("File Error: "+ e.getMessage());
		}
		
		System.out.println("Report generation completed");
	}

}

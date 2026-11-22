package com.exception4;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeFileService {
	
	static void readEmployeeFile() throws IOException{
		
		FileReader reader = new FileReader("employee.txt");
		
		System.out.println("Employee file opened successfully");
		
		reader.close();
	}
	
	public static void main(String[] args) {
		
		try {
			readEmployeeFile();
		}catch(IOException e) {
			System.out.println("File Error: "+ e.getMessage());
		}
		
		System.out.println("Application completed");
	}

}

package views;

import java.util.HashMap;
import java.util.Scanner;

import service.EmployeeServiceImpl;

public class BootClass {
	private static EmployeeServiceImpl  = new EmployeeServiceImpl();
	private static void menuSelection() {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> employeeInput = new HashMap<String,String>();
		
		
		System.out.println("Enter Name");
		String name = scan.nextLine();
		System.out.println("Enter kinId");
		String kinId = scan.nextLine();
		System.out.println("Enter Email");
		String email = scan.nextLine();
		System.out.println("Enter PhoneNumber");
		String phoneNumber = scan.nextLine();
		System.out.println("Enter Date of birth");
		String dob = scan.nextLine();
		System.out.println("Enter Date of Joining");
		String joiningDate = scan.nextLine();
		System.out.println("Enter Address");
		String address = scan.nextLine();
		
		employeeInput.put("name", name);
		employeeInput.put("kinId", kinId);
		employeeInput.put("email", email);
		employeeInput.put("phoneNumber", phoneNumber);
		employeeInput.put("dob", dob);
		employeeInput.put("dateOfJoining", joiningDate);
		employeeInput.put("address", address);
		employeeInput.put("depId",null);
		employeeInput.put("depId",null);
		employeeInput.put("depId",null);
		
		employeeService.AddEmployee(employeeInput);
		
		

	}

	public static void main(String[] args) {
		BootClass.menuSelection();
		employeeService.getAllEmployee();
		
	}

}
package views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import service.EmployeeServiceImpl;

public class UserInteraction {
	private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	private static Scanner scan = new Scanner(System.in);

	public static void addEmployee() {
		HashMap<String, String> employeeInput = new HashMap<String, String>();
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
		employeeInput.put("depId", null);
		employeeInput.put("depId", null);
		employeeInput.put("depId", null);

		employeeService.AddEmployee(employeeInput);
	}

	public static void getAllEmployee() {
		ArrayList<HashMap<String, String>> employeeList = employeeService.getAllEmployee();
		for (int it = 0; it < employeeList.size(); it++) {
			display(employeeList.get(it));
		}
	}

	public static void searchEmployee() {
		System.out.println("Press 1  to Seach From kinId");
		System.out.println("Press 2  to Search From Email");
		System.out.println("Press 3 to EmployeeId");
		int choice = Integer.parseInt(scan.nextLine());
		HashMap<String, String> searchInput = new HashMap<String, String>();
		HashMap<String, String> searchOutput=null;
		switch (choice) {
		case 1:	
			System.out.println("Enter kinId");
			 String id = scan.nextLine();
			 searchInput.put("id", id);
			 searchOutput=employeeService.SeachEmployee(searchInput);
			break;
		case 2:
			System.out.println("Enter email");
			String email = scan.nextLine();
			searchInput.put("email", email);
			searchOutput=employeeService.SeachEmployee(searchInput);
			break;
		case 3:
			System.out.println("Enter EmployeeID");
			String employeeId = scan.nextLine();
			searchInput.put("employeeId", employeeId);
			searchOutput=employeeService.SeachEmployee(searchInput);
		default:
			System.out.println("Wrong Choice");
		}
		if(searchOutput!=null){
			display(searchOutput);
		}else
			System.out.println("Employee doesn't exists");

	}
	
	public static void modifyEmployee(){
		
	}
	
	
	public static void display(HashMap<String, String> employee){
		System.out.println(employee.get("kinId"));
		System.out.println(employee.get("name"));
		System.out.println(employee.get("email"));
		System.out.println(employee.get("phoneNumber"));
	}

	public static void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Press 1  to remove employee From kinId");
//		sca
	}

}

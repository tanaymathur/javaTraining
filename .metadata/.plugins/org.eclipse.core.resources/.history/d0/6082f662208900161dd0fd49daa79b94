package views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import service.EmployeeServiceImpl;

public class BootClass {
	private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	private static void menuSelection() {
		
		System.out.println("Press 1 to Add Employee");
		System.out.println("Press 2 to Search Employee");
		System.out.println("Press 3 to Modify Employee");
		System.out.println("Press 4 to Remove Employee");
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		switch(input){
		case 1 : UserInteraction.addEmployee(); break;
		case 2 : UserInteraction.searchEmployee(); break;
		case 3 : UserInteraction.modifyEmployee(); break;
		case 4 : UserInteraction.searchEmployee(); break;
		default:
			System.out.println("Wrong Selection");
		}
		

	}

	public static void main(String[] args) {
		BootClass.menuSelection();
		ArrayList<HashMap<String, String>> employeeList = employeeService.getAllEmployee(); 
		for(int it = 0 ;it<employeeList.size();it++){
			System.out.println(employeeList.get(it).get("kinId"));
			System.out.println(employeeList.get(it).get("name"));
			System.out.println(employeeList.get(it).get("email"));
			System.out.println(employeeList.get(it).get("phoneNumber"));
		}
		
	}

}

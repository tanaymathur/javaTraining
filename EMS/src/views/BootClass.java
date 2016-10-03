package views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import service.EmployeeServiceImpl;

public class BootClass {
	private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	private static void menuSelection() {
		boolean flag = true;
		while(flag){
		System.out.println("Press 1 to Add Employee");
		System.out.println("Press 2 to Search Employee");
		System.out.println("Press 3 to Modify Employee");
		System.out.println("Press 4 to Remove Employee");
		System.out.println("Press 5 to get All Employees");
		System.out.println("Press 6 to Exit");
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		switch(input){
		case 1 : UserInteraction.addEmployee(); break;
		case 2 : UserInteraction.searchEmployee(); break;
		case 3 : UserInteraction.modifyEmployee(); break;
		case 4 : UserInteraction.removeEmployee(); break;
		case 5 : UserInteraction.getAllEmployee();
		case 6 : flag=false; break;
		default:
			System.out.println("Wrong Selection");
		}
	}
		

	}

	public static void main(String[] args) {
		BootClass.menuSelection();
		
		
	}

}

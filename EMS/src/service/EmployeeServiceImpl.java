package service;

import java.util.Date;
import java.util.HashMap;

import dao.EmployeeDaoImplForList;
import domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
	private static EmployeeDaoImplForList employeeDao = new EmployeeDaoImplForList();
	
	@Override
	public void AddEmployee(HashMap<String, String> employee) {
		String name =  (String)employee.get("name");
		int kin_id = Integer.parseInt(employee.get("kinId"));
		String email = (String) employee.get("email");
		int phoneNumber = Integer.parseInt(employee.get("phoneNumber"));
		Date dob = new Date((String)employee.get("dob"));
		Date dateOfjoining = new Date((String)employee.get("dateOfJoining"));
		String address = (String)employee.get("address");
		int deptId = 0; //Integer.parseInt(employee.get("depId"));
		int projectId = 0 ;//Integer.parseInt(employee.get("projectId"));
		int roleId = 0; //Integer.parseInt(employee.get("roleId"));
		
		Employee emp = new Employee(name, kin_id, email,phoneNumber, dob, dateOfjoining, address, deptId, projectId, roleId); 
		employeeDao.AddEmployee(emp);
	}	

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SeachEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		for(Employee emp : employeeDao.getAllEmployee()){
			System.out.println(emp.getKinId());
			System.out.println(emp.getName());
			System.out.println(emp.getEmail());
			System.out.println(emp.getPhoneNumber());
		}

	}
	

}

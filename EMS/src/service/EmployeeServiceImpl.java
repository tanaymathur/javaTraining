package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import dao.EmployeeDaoImplForList;
import domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	private static EmployeeDaoImplForList employeeDao = new EmployeeDaoImplForList();

	@Override
	public HashMap<String, String> AddEmployee(HashMap<String, String> employee) {
		String name = (String) employee.get("name");
		int kin_id = Integer.parseInt(employee.get("kinId"));
		String email = (String) employee.get("email");
		long phoneNumber = Long.parseLong(employee.get("phoneNumber"));
		Date dob = new Date((String) employee.get("dob"));
		Date dateOfjoining = new Date((String) employee.get("dateOfJoining"));
		String address = (String) employee.get("address");
		int deptId = 0; // Integer.parseInt(employee.get("depId"));
		int projectId = 0;// Integer.parseInt(employee.get("projectId"));
		int roleId = 0; // Integer.parseInt(employee.get("roleId"));

		Employee emp = new Employee(name, kin_id, email, phoneNumber, dob, dateOfjoining, address, deptId, projectId,
				roleId);
		int status = employeeDao.AddEmployee(emp);

		HashMap<String, String> response = new HashMap<String, String>();

		if (status == 0) {
			response.put("status", "failed");
		} else {
			response.put("status", "success");
		}

		return response;
	}

	@Override
	public HashMap<String, String> ModifyEmployee(HashMap<String, String> modifyEmployee) {
		// TODO Auto-generated method stub
		String name = (String) modifyEmployee.get("name");
		int kin_id = Integer.parseInt(modifyEmployee.get("kinId"));
		String email = (String) modifyEmployee.get("email");
		long phoneNumber = Long.parseLong(modifyEmployee.get("phoneNumber"));
		Date dob = new Date((String) modifyEmployee.get("dob"));
		Date dateOfjoining = new Date((String) modifyEmployee.get("dateOfJoining"));
		String address = (String) modifyEmployee.get("address");
		int deptId = 0; // Integer.parseInt(employee.get("depId"));
		int projectId = 0;// Integer.parseInt(employee.get("projectId"));
		int roleId = 0; // Integer.parseInt(employee.get("roleId"));

		Employee emp = new Employee(name, kin_id, email, phoneNumber, dob, dateOfjoining, address, deptId, projectId,
				roleId);

		int status = employeeDao.ModifyEmployee(emp);
		
		HashMap<String, String> response = new HashMap<String, String>();

		if (status == 0) {
			response.put("status", "failed");
		} else {
			response.put("status", "success");
		}

		return response;

	}

	@Override
	public HashMap<String, String> RemoveEmployee(HashMap<String, String> removeEmployee) {
		// TODO Auto-generated method stub
		HashMap<String, String> response = new HashMap<String, String>();
		int status = 0;
		if (removeEmployee.containsKey("id"))
			status = employeeDao.RemoveEmployee(Integer.parseInt(removeEmployee.get("id")));
		else if (removeEmployee.containsKey("email"))
			status = employeeDao.RemoveEmployee(removeEmployee.get("email"));
		else if (removeEmployee.containsKey("employeeId"))
			status = employeeDao.RemoveEmployee(removeEmployee.get("employeeId"));

		if (status == 0) {
			response.put("status", "failed");
		} else {
			response.put("status", "success");
		}

		return response;

	}

	@Override
	public HashMap<String, String> SeachEmployee(HashMap<String, String> searchEmployee) {
		// TODO Auto-generated method stub
		HashMap<String, String> employee = new HashMap<String, String>();
		Employee emp = null;
		if (searchEmployee.containsKey("id"))
			emp = employeeDao.SearchEmployee(Integer.parseInt(searchEmployee.get("id")));
		else if (searchEmployee.containsKey("email"))
			emp = employeeDao.SearchEmployee(searchEmployee.get("email"));
		else if (searchEmployee.containsKey("employeeId"))
			emp = employeeDao.SearchEmployee(searchEmployee.get("employeeId"));

		if (!emp.equals(null)) {
			employee.put("kinId", Integer.toString(emp.getKinId()));
			employee.put("name", emp.getName());
			employee.put("email", emp.getEmail());
			employee.put("phoneNumber", Long.toString(emp.getPhoneNumber()));

			return employee;
		} else
			return null;

	}

	@Override
	public ArrayList<HashMap<String, String>> getAllEmployee() {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, String>> employeeList = new ArrayList<HashMap<String, String>>();
		for (Employee emp : employeeDao.getAllEmployee()) {

			HashMap<String, String> employee = new HashMap<String, String>();

			employee.put("kinId", Integer.toString(emp.getKinId()));
			employee.put("name", emp.getName());
			employee.put("email", emp.getEmail());
			employee.put("phoneNumber", Long.toString(emp.getPhoneNumber()));

			employeeList.add(employee);

		}
		return employeeList;
	}

}

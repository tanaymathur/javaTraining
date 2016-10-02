package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import dao.EmployeeDaoImplForList;
import domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	private static EmployeeDaoImplForList employeeDao = new EmployeeDaoImplForList();

	@Override
	public void AddEmployee(HashMap<String, String> employee) {
		String name = (String) employee.get("name");
		int kin_id = Integer.parseInt(employee.get("kinId"));
		String email = (String) employee.get("email");
		int phoneNumber = Integer.parseInt(employee.get("phoneNumber"));
		Date dob = new Date((String) employee.get("dob"));
		Date dateOfjoining = new Date((String) employee.get("dateOfJoining"));
		String address = (String) employee.get("address");
		int deptId = 0; // Integer.parseInt(employee.get("depId"));
		int projectId = 0;// Integer.parseInt(employee.get("projectId"));
		int roleId = 0; // Integer.parseInt(employee.get("roleId"));

		Employee emp = new Employee(name, kin_id, email, phoneNumber, dob, dateOfjoining, address, deptId, projectId,
				roleId);
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
	public HashMap<String, String> SeachEmployee(HashMap<String, String> searchInput) {
		// TODO Auto-generated method stub
		HashMap<String, String> employee = new HashMap<String, String>();
		Employee emp = null;
		if (searchInput.containsKey("id"))
			emp = employeeDao.SearchEmployee(Integer.parseInt(searchInput.get("id")));
		else if (searchInput.containsKey("email"))
			emp = employeeDao.SearchEmployee(searchInput.get("email"));
		else if (searchInput.containsKey("employeeId"))
			emp = employeeDao.SearchEmployee(searchInput.get("employeeId"));

		if (!emp.equals(null)) {
			employee.put("kinId", Integer.toString(emp.getKinId()));
			employee.put("name", emp.getName());
			employee.put("email", emp.getEmail());
			employee.put("phoneNumber", Integer.toString(emp.getPhoneNumber()));

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
			employee.put("phoneNumber", Integer.toString(emp.getPhoneNumber()));

			employeeList.add(employee);

		}
		return employeeList;
	}

}

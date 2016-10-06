package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import domain.Employee;
import util.Jdbc;

public class EmployeeDaoImplForList implements IemployeeDao {

	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void AddEmployee(Employee emp) {
		try(Connection dbConnection=Jdbc.connection()) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int kinId = emp.getKinId();
		String email = emp.getEmail();
		int phoneNumber = emp.getPhoneNumber();
		int dob = 
		employeeList.add(emp);

	}

	@Override
	public void ModifyEmployee(Employee emp) {
		// TODO Auto-generated method stub
		for (int it = 0; it < employeeList.size(); it++) {
			if (employeeList.get(it).getEmail() == emp.getEmail())
				employeeList.set(it, emp);
		}
	}

	@Override
	public void RemoveEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee SearchEmployee(Object emp) {
		// TODO Auto-generated method stub
		for (int it = 0; it < employeeList.size(); it++) {
			if (employeeList.get(it).getEmail() == (String) emp || employeeList.get(it).getKinId() == (int) emp)
				return employeeList.get(it);
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeList;
	}

}

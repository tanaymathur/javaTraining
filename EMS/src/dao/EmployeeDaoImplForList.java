package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import domain.Employee;
import util.Jdbc;

public class EmployeeDaoImplForList implements IemployeeDao {

	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private Properties props = Jdbc.props;
	@Override
	public int AddEmployee(Employee emp) {
		try(Connection dbConnection=Jdbc.connection()) {
			int kinId = emp.getKinId();
			String email = emp.getEmail();
			long phoneNumber = emp.getPhoneNumber();
			String dob = null; 
	 		String dateOfJoining = null;
	 		String address = emp.getAddress();
			
	 		String insertQuery=props.getProperty("jdbc.query.parmeterizedInsert");		
	 		
	 		try(PreparedStatement insertStatement = dbConnection.prepareStatement(insertQuery)){
			  	insertStatement.setInt(1,kinId);
			  	insertStatement.setString(2, email);
				insertStatement.setLong(3, phoneNumber);
				insertStatement.setString(3, dob);
				insertStatement.setString(5, dateOfJoining);
				
				return insertStatement.executeUpdate();
	 		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try(Connection dbConnection=Jdbc.connection()) {
			
	 		String =props.getProperty("jdbc.query.parameterizedSearch");		
	 		
	 		try(PreparedStatement insertStatement = dbConnection.prepareStatement(insertQuery)){
			  	
	 		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

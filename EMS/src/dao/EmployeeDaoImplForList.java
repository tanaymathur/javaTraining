package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import domain.Employee;
import util.Jdbc;

public class EmployeeDaoImplForList implements IemployeeDao {

	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	private Properties props = Jdbc.props;

	@Override
	public int AddEmployee(Employee emp) {
		try (Connection dbConnection = Jdbc.connection()) {
			String name = emp.getName();
			int kinId = emp.getKinId();
			String email = emp.getEmail();
			long phoneNumber = emp.getPhoneNumber();
			String dob = emp.getDob();
			String dateOfJoining = emp.getDateOfJoining();
			String address = emp.getAddress();
			int deptId = emp.getDeptId();
			int projectId= emp.getProjectId();
			int roleId = emp.getRoleId();

			String insertQuery = props.getProperty("jdbc.query.parmeterizedInsert");

			try (PreparedStatement insertStatement = dbConnection.prepareStatement(insertQuery)) {
				insertStatement.setString(1,name);
				insertStatement.setInt(2, kinId);
				insertStatement.setString(3, email);
				insertStatement.setLong(4, phoneNumber);
				insertStatement.setString(5, dob);
				insertStatement.setString(6, dateOfJoining);
				insertStatement.setString(7, address);
				insertStatement.setInt(8,deptId);
				insertStatement.setInt(9, projectId);
				insertStatement.setInt(10, roleId);
				System.out.println(insertStatement);
				
				return insertStatement.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public int ModifyEmployee(Employee emp) {
		// TODO Auto-generated method stub

		/*for (int it = 0; it < employeeList.size(); it++) {
			if (employeeList.get(it).getEmail() == emp.getEmail())
				employeeList.set(it, emp);
		}*/
		try (Connection dbConnection = Jdbc.connection()) {
			String name = emp.getName();
			int kinId = emp.getKinId();
			String email = emp.getEmail();
			long phoneNumber = emp.getPhoneNumber();
			String dob = emp.getDob();
			String dateOfJoining = emp.getDateOfJoining();
			String address = emp.getAddress();
			int deptId = emp.getDeptId();
			int projectId= emp.getProjectId();
			int roleId = emp.getRoleId();

			String updateQuery = props.getProperty("jdbc.query.parameterizedUpdate");

			try (PreparedStatement updateStatement = dbConnection.prepareStatement(updateQuery)) {
				updateStatement.setString(1,name);
				updateStatement.setString(2, email);
				updateStatement.setLong(3, phoneNumber);
				updateStatement.setString(4, dob);
				updateStatement.setString(5, dateOfJoining);
				updateStatement.setString(6, address);
				updateStatement.setInt(7,deptId);
				updateStatement.setInt(8, projectId);
				updateStatement.setInt(9, roleId);
				updateStatement.setInt(10, kinId);
				System.out.println(updateStatement);
				
				return updateStatement.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int  RemoveEmployee(Object emp) {
		// TODO Auto-generated method stub
		try (Connection dbConnection = Jdbc.connection()) {

			String removeQuery = props.getProperty("jdbc.quey.parameterizedRemove");

			try (PreparedStatement removeStatement = dbConnection.prepareStatement(removeQuery)) {
				if (emp instanceof String) {
					removeStatement.setString(1, (String) emp);
					removeStatement.setInt(2, (Integer) 0);
				} else if (emp instanceof Integer) {
					removeStatement.setString(1, null);
					removeStatement.setInt(2, (Integer) emp);
				}
				return removeStatement.executeUpdate();
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public Employee SearchEmployee(Object emp) {
		// TODO Auto-generated method stub
		try (Connection dbConnection = Jdbc.connection()) {

			String searchQuery = props.getProperty("jdbc.quey.parameterizedSearch");

			try (PreparedStatement searchStatement = dbConnection.prepareStatement(searchQuery)) {
				if (emp instanceof String) {
					searchStatement.setString(1, (String) emp);
					searchStatement.setInt(2, (Integer) 0);
				} else if (emp instanceof Integer) {
					searchStatement.setString(1, null);
					searchStatement.setInt(2, (Integer) emp);
				}
				System.out.println(searchStatement);
				ResultSet result = searchStatement.executeQuery();
				if (result.next()) {
					String name = result.getString(1);
					int KinId = result.getInt(2);
					String email = result.getString(3);
					long phoneNumber = result.getLong(4);
					Date dob = result.getDate(5);
					Date dateOfjoining = result.getDate(6);
					String address = result.getString(7);
					int depId = result.getInt(8);
					int projectId = result.getInt(9);
					int roleId = result.getInt(10);
					return new Employee(name, KinId, email, phoneNumber, dob, dateOfjoining, address, depId, projectId,
							roleId);
				} 
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*for (int it = 0; it < employeeList.size(); it++) {
			if (employeeList.get(it).getEmail() == (String) emp || employeeList.get(it).getKinId() == (int) emp)
				return employeeList.get(it);
		}
		*/
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeList;
	}

}

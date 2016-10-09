package dao;

import java.util.ArrayList;

import domain.Employee;

public interface IemployeeDao {
	
	public int AddEmployee(Employee emp);
	public int ModifyEmployee(Employee emp);
	public int RemoveEmployee(Object emp);
	public Employee SearchEmployee(Object emp);
	public ArrayList<Employee> getAllEmployee();

}

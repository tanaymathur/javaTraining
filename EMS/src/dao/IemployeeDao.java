package dao;

import java.util.ArrayList;

import domain.Employee;

public interface IemployeeDao {
	
	public void AddEmployee(Employee emp);
	public void ModifyEmployee(Employee emp);
	public void RemoveEmployee(Employee emp);
	public void SearchEmployee(Employee emp);
	public ArrayList<Employee> getAllEmployee();

}

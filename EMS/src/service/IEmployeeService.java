package service;

import java.util.ArrayList;
import java.util.HashMap;

public interface IEmployeeService {
	
	public void AddEmployee(HashMap<String, String> employee);
	public void ModifyEmployee();
	public void RemoveEmployee();
	public void SeachEmployee();
	public ArrayList<HashMap<String, String>> getAllEmployee();

}

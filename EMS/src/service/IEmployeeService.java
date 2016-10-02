package service;

import java.util.ArrayList;
import java.util.HashMap;

public interface IEmployeeService {
	
	public void AddEmployee(HashMap<String, String> employee);
	public void ModifyEmployee();
	public void RemoveEmployee();
	public HashMap<String, String> SeachEmployee(HashMap<String, String> searchInput);
	public ArrayList<HashMap<String, String>> getAllEmployee();

}

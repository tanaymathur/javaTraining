package service;

import java.util.ArrayList;
import java.util.HashMap;

public interface IEmployeeService {
	
	public HashMap<String, String> AddEmployee(HashMap<String, String> employee);
	public HashMap<String, String> ModifyEmployee(HashMap<String, String> modifyEmployee);
	public HashMap<String, String> RemoveEmployee(HashMap<String, String> removeEmployee);
	public HashMap<String, String> SeachEmployee(HashMap<String, String> searchEmployee);
	public ArrayList<HashMap<String, String>> getAllEmployee();

}

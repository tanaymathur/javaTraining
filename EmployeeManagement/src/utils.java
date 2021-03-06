import java.util.TreeMap;


public class utils {
	static TreeMap<String,Employee> EmpTreeMap = new TreeMap<>();
	
	public static void addEmployee(String EmpId,Employee emp) {
		EmpTreeMap.put(EmpId, emp);
	}
	
	
	public static Employee searchEmployee(String EmpId) throws EmployeeNotFoundException{
		Employee emp = EmpTreeMap.get(EmpId);
		if(emp != null)
			return emp;
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}
	
	

}

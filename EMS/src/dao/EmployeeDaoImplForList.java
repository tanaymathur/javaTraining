package dao;

import java.util.ArrayList;

import domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {
	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	@Override
	public  void AddEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeList.add(emp);
		
	}

	@Override
	public void ModifyEmployee(Employee emp) {
		// TODO Auto-generated method stub
		for(int it = 0; it<employeeList.size();it++){
			if(employeeList.get(it).getEmail()==emp.getEmail())
				employeeList.set(it,emp);
		}
	}

	@Override
	public void RemoveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void SearchEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeList; 		
	}

}

class Main {
	public static void main(String args[]) {
		
		Employee emp[]= new Employee[5];
		emp[0] = new Employee("Tanay", "Mathur", "1000", "developer", new Date("01", "07", "2016"));
		emp[1] = new Employee("Saurabh", "pRasad", "10000", "developer", new Date("03", "07", "2016"));
		emp[2] = new Employee("Aranva", "garawal", "5000", "developer", new Date("06", "07", "2016"));
		emp[3] = new Employee("anmol", "bansal", "2000", "developer", new Date("01", "07", "2016"));
		emp[4] = new Employee("pavan", "koli", "3000", "developer", new Date("01", "07", "2016"));
		System.out.println(Employee.getNumberOfEmployee());
		for (int i = 0; i < emp.length; i++) {
	
			System.out.println(emp[i].getFirstName()+ " " + emp[i].getLastName());
			System.out.println(emp[i].getSalary());
			System.out.println(emp[i].getJoiningDate());
			System.out.println("\n");
		}
		
		try{
			Employee employee = Employee.search(2);
			System.out.println(employee.getFirstName()+ " " + employee.getLastName());
			System.out.println(employee.getSalary());
			System.out.println(employee.getJoiningDate());
		}catch(EmployeeNotFoundException ene){
			System.out.println("Employee not found");
		}finally{
			System.out.println("Search Ends");
		}
	}
}
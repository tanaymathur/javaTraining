class Main {
	public static void main(String args[]) {
		Date date = new Date("01", "07", "2016");
		Employee emp = new Employee("Tanay", "Mathur", "1000", "developer",date);
		System.out.println(Employee.getNumberOfEmployee());
		System.out.println(emp.getFirstName()+ " " + emp.getLastName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getJoiningDate());
	}
}
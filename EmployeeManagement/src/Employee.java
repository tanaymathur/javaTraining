abstract class Employee {
	static int numberOfEmployee = 0;
	private int id;
	private String firstName, lastName;
	// private static Employee EmployeeId[] = new Employee[5];
	protected String salary;
	private String grade;
	private String joiningDate;

	{
		numberOfEmployee++;
	}

	Employee(String fName, String lastName, String salary, String grade, Date date) {
		this.id = numberOfEmployee;
		this.firstName = fName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joiningDate = date.getDate();
		// EmployeeId[getNumberOfEmployee()-1] = this;
	}

	public static int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public abstract String getSalary();

	public String getGrade() {
		return grade;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	/*
	 * public static Employee search(int id) throws EmployeeNotFoundException {
	 * for (int i = 0; i < EmployeeId.length; i++) { if (EmployeeId[i].id == id)
	 * { return EmployeeId[i]; } } throw new EmployeeNotFoundException(
	 * "Employee Not Found");
	 * 
	 * 
	 * }
	 */
}
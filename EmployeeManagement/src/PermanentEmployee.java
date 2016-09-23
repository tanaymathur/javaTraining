
public class PermanentEmployee extends Employee {
	private static int numberOfEmployee = 0;

	{
		numberOfEmployee++;
	}

	public PermanentEmployee(String fName, String lastName, String salary, String grade, Date date) {
		super(fName, lastName, salary, grade, date);
		// TODO Auto-generated constructor stub
	}

	public String getSalary() {
		return this.salary;
	}

	public static int getNumberOfEmployee() {
		return numberOfEmployee;
	}
	

}

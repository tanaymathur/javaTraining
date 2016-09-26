
public class ContractBasedEmployee extends Employee {
	private int rate, workingHours;
	private Contractor contractor;
	private static int numberOfCbEmployee = 0;
	
	{
		numberOfCbEmployee++;
	}
	public ContractBasedEmployee(String fName, String lastName, String salary, String grade, Date date, int rate,
			int workingHours, Contractor contractor) {
		super(fName, lastName
				, null , grade, date);
		this.rate = rate;
		this.workingHours = workingHours;
		this.contractor = contractor;
		contractor.addCbEmployee(fName+" "+lastName);
	}

	public String getSalary() {
		return Integer.toString(rate * workingHours);
	}
	
	public static int getNumberOfCbEmployee(){
		return numberOfCbEmployee;
	}
	
	public String getContractor() {
		return this.contractor.getName();
	}

}

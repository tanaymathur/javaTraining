
public class Contractor {
	private String name;
	private String cbEmpList[] = new String[10];
	private int numberOfCbEmployeesUnder=0;
	public Contractor(String name) {
		this.name = name;
	}
	
	public  void addCbEmployee(String CbEmployee){
		this.cbEmpList[numberOfCbEmployeesUnder] = CbEmployee;
		numberOfCbEmployeesUnder++;
	}
	
	public int getCbEmployees(){
		return numberOfCbEmployeesUnder;
	}
}

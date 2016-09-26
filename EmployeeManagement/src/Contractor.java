
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
	
	public String getName(){
		return name;
	}
	
	public int getCbEmployees(){
		return numberOfCbEmployeesUnder;
	}
	
	public String getCbEmployeeList(){
		String list="";
		for(String it : cbEmpList){
			list+=it;
			list+="|";
		}
		return list;
	}
}

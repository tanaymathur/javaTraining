
public class EmpId {
	private int prefix;
	private String suffix;
	public EmpId(int prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public String getEmpId() {
		return Integer.toString(prefix)+" "+suffix;
	}

}

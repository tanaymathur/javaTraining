
public class Date {
	private String day, month, year;

	
	public Date(String day, String month, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public String getDate(){
	   return this.day+":"+this.month+":"+this.year; 
	}
}

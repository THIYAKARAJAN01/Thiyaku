package oops;

public class Encapsulation {
	
	private String Investor;
	private int Date;
	
	public void  Investor() {
		
		System.out.println(Investor);
	}
		
	
	public void  Date() {
		
		System.out.println(Date);
	}
		
//////////////////////////////////////////////////////////

	
	private String empName;
	private int empSalary;
	
	public void SetempName(String empName)
	{
		this.empName = empName;
	}
	public void SetempSalary(int empSalary)
	{
		this.empSalary = empSalary;
	}
	
	public void getempName()
	{
		System.out.println(empName);
	}
	public void getempSalary()
	{
	   System.out.println(empSalary);
	}
	

	public static void main(String[] args) {
		
		Encapsulation Er = new Encapsulation();
		Er.Investor();
		Er.Date();
		
	
		
		
		// TODO Auto-generated method stub

	}

}

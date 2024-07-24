package oops;

public class AppForm {
	
	String Name;
	long number;
	
	public void display()
	{
		System.out.println(Name);
		System.out.println(number);
	}
	
	public void SetName(String h , int num) 
	{
		Name = h;
		number = num;
	}

	public static void main(String[] args) {
		
		AppForm af = new AppForm();
		af.SetName("arun", 567842);
		af.display();
		
		
		AppForm af1 = new AppForm();
		af1.Name="Vijay";
		af1.number=9360166375l;
		af1.display();
		// TODO Auto-generated method stub

	}

}

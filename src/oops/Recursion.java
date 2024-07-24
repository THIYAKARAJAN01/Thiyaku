package oops;

public class Recursion {

	public static void main(String[] args) {
		
		recursion(10);
		// TODO Auto-generated method stub

	}
	
	public static void recursion(int n) 
	{
		
		if (n==1) 
		{
			
		System.out.println(1);
	}
	else
	{
		System.out.println(n);
		recursion(n-1);
		
	}

	}
}

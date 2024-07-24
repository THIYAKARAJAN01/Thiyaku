package oops;

public class CompileDemo {
	
	public static void add()
	{
		int a=40;
		int b=40;
		System.out.println(a+b);
		
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public static void add(String s)
	{
		int a=80;
		int b=60;
		System.out.println(a+b);
	}
	public static void add(char c)
	{
		int a=70;
		int b=30;
		System.out.println(a+b);
	}
	public static void add(long l)
	{
		int a=50;
		int b=40;
		System.out.println(a+b);
		
	}
	public static void add(String s1, String s2)
	{
		int a=11;
		int b=22;
		System.out.println(a+b);
		
	}
	
	public void main()
	{
		
	}
	public void main(int a)
	{
		
	}
	public void main(char a)
	{
		
	}
	

	public static void main(String[] args) {
		add();
		add();
		add("see");
		add('o');
		add(645467383L);
		add("s1","s2");
		// TODO Auto-generated method stub

	}

}

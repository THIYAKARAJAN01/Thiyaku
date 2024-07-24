package ifladder;

public class DoWhile {

	public static void main(String[] args) {
		
		int n = 5;
		int sum = 0;
		int i = 1;
		
			while(i<=n) {
			sum += i;
			i++;
			}
			
			System.out.println("no of sum:"+ sum);
	
////////////////////////////////////////////////////////////////////////////////		
		do
		{
			sum +=i;
			i++;
		}
		while(i<=n);

			System.out.println("no of sum:"+ sum);
		
		
		// TODO Auto-generated method stub

	}

}

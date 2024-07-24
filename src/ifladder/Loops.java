
package ifladder;

public class Loops {

	public static void main(String[] args) {
		
		int n = 5;
		int sum =1;
		
		for(int i=1;i<=n;i++) {
			sum *= i;
			
		}
		
		System.out.println("fact of 5:" + sum);
		
		/////////////////////////////////////////////
		
		for(int j=1;j<5;j++) {
			
			System.out.println("Java");
		}
		
		/////////jump statements///////////////
		
		for(int k=1;k<=10;k++)
		{
		if (k==5)
		{
		continue;
		}
		System.out.println(k);
		}
		
	//////////////////////////////////////////
		
		for(int l=0;l<=2;l++) 
		{
			for(int i=0;i<=2;i++) 
			
			{
				System.out.println(l +" " + i);
			}
		}
		// TODO Auto-generated method stub

	}

}

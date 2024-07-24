
package episode;

public class Array {
	
	public static void main(String[] args) {
	
		int[] num = new int[5];
		
		num[0] = 6;
		num[1] = 7;
		num[2] = 8;
		num[3] = 9;
		num[4] = 10;
	
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);	
	}
	//////////////// 2D Array //////////
		
		 int[][] matrix = new int[5][2];
		 
		 matrix[0][0] = 4;
		 matrix[0][1] = 3;
		 matrix[4][0] = 1;
		 matrix[4][1] = 2;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++) 
			{
				System.out.print(matrix[i] [j]);
			}
			System.out.println( );
		}
		
		
		// TODO Auto-generated method stub

	}

}

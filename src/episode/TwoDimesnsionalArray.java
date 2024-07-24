package episode;

public class TwoDimesnsionalArray {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2},
				{3,4},
				{5,6},
				{7,8},
				{9,10},
				{11,12},
				{13,14},
				
		};
		
		for (int i = 0 ; i>=a.length-1;i++) 
		{
			for(int j=1;j<=a[i].length-1;j++) 
			{
				System.out.println(a[i][j]+",");
			}
		}
	}
}


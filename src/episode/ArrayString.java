package episode;

import java.util.Arrays;

public class ArrayString {


	public static void main(String[] args) {
		
		//array literal
		
		int []c = {
				1,
				2,
				3,
				4,
				5,
				6,
		};
		{
			System.out.println(Arrays.toString(c));
		}
		
		//using new keyword without using size
		
		Object obj[] = {1,'s', 1333456L, "java",true};
		{
			System.out.println(Arrays.toString(obj));
		}
		
		//using new keyword
		int data[] = new  int[1000]; //fix the size
		data[0] = 475;
		data[1] = 375;
		for(int dd:data) {
			System.out.println(dd);
		}
		
		// reverse print 
		int date[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i = date.length-1;i>=0;i--)
		 {
			System.out.println(date[i]);
		}
		int a[] = new int[4];
				
		
		a [0] = 10;
		a [1] = 20;
		a [2] = 30;
		a [3] = 40;

		//looping without run
		System.out.println(Arrays.toString(a));
		// looping with run
		
		int b[] = {1,2,3,4,5,6,7};
		
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		
		//String with Array 
		String [] Phones = {"Mi", "Poco","Samsung","Iphone"};
		System.out.println(Arrays.toString(Phones)); 
		
		System.out.println(Phones[1]);
		System.out.println(Phones.length);
		System.out.println(Phones[Phones.length-1]);
		// TODO Auto-generated method stub

	}

}

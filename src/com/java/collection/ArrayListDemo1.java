package com.java.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(null);
		al.add(1234);
		al.add(566778547457L);
		al.add("Helo");
		al.add('P');
		al.add(7812.00);
		
		al.add(3,"Java");
		
		System.out.println(al);
		
		al.remove(0);
		
		
		for(int i=0; i<=al.size()-1;i++)
		{
			
			System.out.println(al.get(i));
		}
		// TODO Auto-generated method stub

	}

}

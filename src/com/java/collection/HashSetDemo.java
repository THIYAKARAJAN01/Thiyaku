package com.java.collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		
		
		hs.add(10);
		hs.add(1240);
		hs.add(null);
		hs.add(10);
		hs.add(124);
		hs.add(10);
		hs.add(20);
		hs.add(15608);
		hs.add(124);
		hs.add(1100);
		
		System.out.println(hs);

		Iterator<Object>di =hs.iterator();
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
		
		
		// TODO Auto-generated method stub

	}

}

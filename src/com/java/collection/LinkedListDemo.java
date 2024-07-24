package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Object> Ll	= new LinkedList<Object>();
		
		Ll.add(10.23456);
		Ll.add(null);
		Ll.add(10.23456);
		Ll.add(987898066777L);
		Ll.add(true);
		Ll.add(10.23456);
		Ll.add(10.23456);
		Ll.add('s');
		Ll.add("java");
		Ll.add(50);
		
for(int i=0;i<=Ll.size()-1;i++)
{
	System.out.println(Ll.get(i));
}
	
		Iterator<Object>di = Ll.descendingIterator();
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
		// TODO Auto-generated method stub

	}

}

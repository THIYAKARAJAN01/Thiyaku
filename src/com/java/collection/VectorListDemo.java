package com.java.collection;

import java.util.Vector;

public class VectorListDemo {

	public static void main(String[] args) {
		
		Vector<Object> Vc = new Vector<Object>();
		
		Vc.add(10.345F);
		Vc.add(10.3455F);
		Vc.add(null);
		Vc.add(10);
		Vc.add("Java");
		Vc.add('t');
		Vc.add(50);
		Vc.add(null);
		Vc.add(10675656453345L);
		Vc.add(50);
		Vc.add(null);
		Vc.add(null);
		
		Vc.remove(2);
		
		Vc.add(0,"Seleninum");
		
		System.out.println(Vc);
		
		for (int i=0 ; i<=Vc.size()-1;i++)
		{
			System.out.println(Vc.get(i));
		}
		// TODO Auto-generated method stub

	}

}

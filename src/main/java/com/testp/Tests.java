package com.testp;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(5);

		al.add(2);
		al.add(1);
		al.add(3);
		al.add(5);
		List a =(List) Arrays.asList(1,2,3,4,5);

		System.out.println(a);
		Set<Integer> s = new HashSet<Integer>();
		
		
		
		for (Integer integer : al) {
		
			s.add(integer);
		}
	}

}

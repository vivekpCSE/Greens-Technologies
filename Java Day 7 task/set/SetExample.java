package org.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("\nQ1.1");

		Set<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		set.add(90);
		set.add(10);
		set.add(20);

		System.out.println(set);
		System.out.println("\nQ1.2");
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		set1.add(70);
		set1.add(80);
		set1.add(90);
		set1.add(10);
		set1.add(20);

		System.out.println(set1);
		System.out.println("\nQ1.3");
		 Set<Integer> set2 = new TreeSet<>();

	        set2.add(10);
	        set2.add(20);
	        set2.add(30);
	        set2.add(40);
	        set2.add(50);
	        set2.add(60);
	        set2.add(70);
	        set2.add(80);
	        set2.add(90);
	        set2.add(10);
	        set2.add(20);

	        System.out.println(set2);
	        System.out.println("\nQ2");
	        List<Integer> list1 = new ArrayList<>();
	        Collections.addAll(list1, 10,20,30,90,10,10,40,50);
	        Set<Integer> example1=new HashSet<>();
	        example1.addAll(list1);

	        System.out.println(list1);
	        System.out.println(example1);
	        
	        System.out.println("\nQ3");
	        for (Integer enhanced : set2) {
	        	System.out.println(enhanced);
	        }
	        	 System.out.println("\nQ4");
	        	 
				Set<Integer> set3=new LinkedHashSet<>();
				Collections.addAll(set3, 10,20,30,90,10,10,40,50);
				Set<Integer> set4=new LinkedHashSet<>();
				Collections.addAll(set4, 10,20,60,50,40,70,80,90);
				set3.retainAll(set4);
				
				System.out.println(set3);
	}
}
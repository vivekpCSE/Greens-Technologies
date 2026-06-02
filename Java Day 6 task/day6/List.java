package org.day6;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class List {
    public static void main(String[] args) {
//4.1
       	System.out.println("\nQ4.1");
        ArrayList<Integer> list = new ArrayList<>();
       
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);

        System.out.println(list.size()); 
        //4.2
       	System.out.println("\nQ4.2");
        LinkedList<Integer> list1 =new LinkedList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
        list1.add(600);
        list1.add(700);

        System.out.println(list1.size()); 
       //4.3
       	System.out.println("\nQ4.3");
        Vector<Integer> list2 = new Vector<>();
        
        list2.add(105);
        list2.add(200);
        list2.add(350);
        list2.add(400);
        list2.add(505);
        list2.add(605);
        list2.add(700);
        list2.add(705);
        System.out.println(list2.size()); 
        //5.1
       	System.out.println("\nQ5.1");
        int indexOf = list1.indexOf(100);
        System.out.println(indexOf); 
        //5.2
       	System.out.println("\nQ5.2");
        int lastIndexOf = list1.lastIndexOf(100);
        System.out.println(lastIndexOf); 
        //5.3
       	System.out.println("\nQ5.3");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(
        	    10, 20, 30, 90, 10, 10, 40, 50, 10));

        	for (int i = 0; i < list3.size(); i++) {
        	    if (list3.get(i) == 10) {
        	        System.out.println(i);
        	    }
        	}
        	//6
           	System.out.println("\nQ6");
        	Integer integer1 = list3.get(2);
        	System.out.println(integer1);
        	//6.4
        	System.out.println("\nQ6.4");

        	for (int i = 0; i < list3.size(); i++) {
        	    System.out.println(list3.get(i));
        	}
        	//6.5
        	System.out.println("\nQ6.5");
        	for(Integer enhanced :list3) {
        		System.out.println(enhanced);
        	}
        		//7
            	System.out.println("\nQ7");
            	 //5.3
            	LinkedList<Integer> list4 = new LinkedList<>(
            		    Arrays.asList(100, 200, 300, 400, 500, 600, 700)
            		);
            	Integer remove = list4.remove(2);
            	System.out.println(remove);
        	
            	//8
            	System.out.println("\nQ8");	
            	list4.addLast(80);
            	System.out.println(list4);

            	//9
            	System.out.println("\nQ9");	
            	list4.set(6, 750);
            	System.out.println(list4);
            	

            	//10
            	System.out.println("\nQ10");	
            list1.retainAll(list2);
            System.out.println(list1);
            //11
          
        	System.out.println("\nQ1");	
        	list1.removeAll(list3);
        	System.out.println(list1);
        	
    }
    
    
}
    

package org.day5;

import java.util.LinkedHashSet;

public class Array {
	
	    public static void main(String[] args) {

	        // Sum values of an array
	        int[] a = {1,2,3,4,5,6,7,8,9,10};

	        int sum = 0;
	        for (int num : a) {
	            sum += num;
	        }

	        System.out.println("Sum = " + sum);

	        // Average of array
	        double average = (double) sum / a.length;
	        System.out.println("Average = " + average);
	   //remove duplicate in an array
	        int arr[]= {10,10,20,50,60,80,50};
	        LinkedHashSet<Integer> set =new LinkedHashSet<Integer>();
	        for(int num1:arr) {
	        	 set.add(num1);
	        }
	       System.out.println(set); 
	       //find length 
	       int length =arr.length;
	       System.out.println("length is"+ " " +length);
	       
	      
	}
}

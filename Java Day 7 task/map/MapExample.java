package org.day7;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map;
public class MapExample {
	

	

	    public static void main(String[] args) {

	        // 1. HashMap
	    	System.out.println("\nQ1.1");
	        HashMap<Integer, String> hashMap = new HashMap<>();

	        hashMap.put(10, "java");
	        hashMap.put(20, "sql");
	        hashMap.put(30, "oops");
	        hashMap.put(40, "Sql");
	        hashMap.put(50, "oracle");
	        hashMap.put(60, "DB");
	        hashMap.put(10, "selenium");
	        hashMap.put(50, "psql");
	        hashMap.put(40, "Hadoop");
	        System.out.println(hashMap);

	        // 2. LinkedHashMap
	        System.out.println("\nQ1.2");
	        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

	        linkedHashMap.put(10, 10);
	        linkedHashMap.put(20, 20);
	        linkedHashMap.put(30, 30);
	        linkedHashMap.put(40, 40);
	        linkedHashMap.put(50, 50);
	        linkedHashMap.put(60, 60);
	        linkedHashMap.put(10, 10);
	        linkedHashMap.put(50, 50);
	        linkedHashMap.put(40, 40);

	        System.out.println(linkedHashMap);

	        // 3. TreeMap
	        System.out.println("\nQ1.3");
	        TreeMap<Character, Integer> treeMap = new TreeMap<>();

	        treeMap.put('!', 10);
	        treeMap.put('@', 20);
	        treeMap.put('#', 30);
	        treeMap.put('$', 40);
	        treeMap.put('%', 50);
	        treeMap.put('^', 60);
	        treeMap.put('&', 10);
	        treeMap.put('*', 50);
	        treeMap.put('(', 40);

	      
	        System.out.println(treeMap);

	        // 4. Hashtable
	        System.out.println("\nQ1.4");
	        Hashtable<String, String> hashtable = new Hashtable<>();

	        hashtable.put("vel", "Selenium");
	        hashtable.put("Ganesh", "framework");
	        hashtable.put("Dinesh", "oracle");
	        hashtable.put("Venqat", "corejava");
	        hashtable.put("subash", "jira");

	     
	        System.out.println(hashtable);
	        // 2.1 HashMap
	        System.out.println("\nQ2.1");
	    
	        HashMap<Integer, String> hm = new HashMap<>();

	        hm.put(10, "java");
	        hm.put(20, "sql");
	        hm.put(30, "oops");
	        hm.put(40, "Sql");
	        hm.put(50, "oracle");
	        hm.put(60, "DB");
	        hm.put(10, "selenium");
	        hm.put(50, "psql");
	        hm.put(40, "Hadoop");

	        System.out.println("HashMap Keys:");
	        for (Integer key : hm.keySet()) {
	            System.out.println(key);
	        }

	        // 2.2 LinkedHashMap
	        System.out.println("\nQ2.2");
	        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();

	        lhm.put(10, 10);
	        lhm.put(20, 20);
	        lhm.put(30, 30);
	        lhm.put(40, 40);
	        lhm.put(50, 50);
	        lhm.put(60, 60);
	        lhm.put(10, 10);
	        lhm.put(50, 50);
	        lhm.put(40, 40);

	       
	        for (Integer key : lhm.keySet()) {
	            System.out.println(key);
	        }

	        // 2.3 TreeMap
	        System.out.println("\nQ2.3");
	        TreeMap<Character, Integer> tm = new TreeMap<>();

	        tm.put('!', 10);
	        tm.put('@', 20);
	        tm.put('#', 30);
	        tm.put('$', 40);
	        tm.put('%', 50);
	        tm.put('^', 60);
	        tm.put('&', 10);
	        tm.put('*', 50);
	        tm.put('(', 40);

	     
	        for (Character key : tm.keySet()) {
	            System.out.println(key);
	        }

	        // 2.4 Hashtable
	        System.out.println("\nQ2.4");
	        Hashtable<String, String> ht = new Hashtable<>();

	        ht.put("vel", "Selenium");
	        ht.put("Ganesh", "framework");
	        ht.put("Dinesh", "oracle");
	        ht.put("Venqat", "corejava");
	        ht.put("subash", "jira");

	        for (String key : ht.keySet()) {
	            System.out.println(key);
	        }
	        System.out.println("\nQ3.1");
	        HashMap<Integer, String> hm1 = new HashMap<>();

	        hm1.put(10, "java");
	        hm1.put(20, "sql");
	        hm1.put(30, "oops");
	        hm1.put(40, "Sql");
	        hm1.put(50, "oracle");
	        hm1.put(60, "DB");
	        hm1.put(10, "selenium");
	        hm1.put(50, "psql");
	        hm1.put(40, "Hadoop");

	       
	        System.out.println(hm.values());

	        // 3.2 LinkedHashMap
	        System.out.println("\nQ3.2");
	        LinkedHashMap<Integer, Integer> lhm1 = new LinkedHashMap<>();

	        lhm1.put(10, 10);
	        lhm1.put(20, 20);
	        lhm1.put(30, 30);
	        lhm1.put(40, 40);
	        lhm1.put(50, 50);
	        lhm1.put(60, 60);
	        lhm1.put(10, 10);
	        lhm1.put(50, 50);
	        lhm1.put(40, 40);

	        System.out.println("\nLinkedHashMap Values:");
	        System.out.println(lhm1.values());
	        
	        System.out.println("\nQ4");
	        HashMap<Integer, String> map = new HashMap<>();

	        map.put(10, "java");
	        map.put(20, "sql");
	        map.put(30, "oops");
	        map.put(40, "Sql");
	        map.put(50, "oracle");
	        map.put(60, "DB");
	        map.put(10, "selenium");
	        map.put(50, "psql");
	        map.put(40, "Hadoop");

	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
	}


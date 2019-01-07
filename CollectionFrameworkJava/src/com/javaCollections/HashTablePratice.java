package com.javaCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTablePratice {

	public static void main(String[] args) {
		/* This class implements a hash table, which maps keys to values. 
		 * Any non-null object can be used as a key or as a value.

		+It is similar to HashMap, but is synchronised.
		+Hashtable stores key/value pair in hash table.
		+In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. 
		The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.

		The important points about Java Hashtable class are:
		A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
		+It contains only unique elements.
		+It may have not have any null key or value.
		+It is synchronized. */ 

 // hashCode number = 32 bit int 
		 Hashtable h1 = new Hashtable();
		 h1.put(1, "Sachi");
		 h1.put(2, "Ruchi");
		 h1.put(3, "Prachi");
		 
		 //create a clone copy/shallow copy 
		 Hashtable h2 = new Hashtable();
		 
		 h2 = (Hashtable)h1.clone();
		// Remove 
		 h1.clear();
		 System.out.println("the values from h1 " + h1);
		 System.out.println("the values from h2 " + h2);
		 
		 System.out.println("**********************************");
		 h1.clear();
		 System.out.println("the values from h1 " + h1);
		 System.out.println("the values from h2 " + h2);
		 
		 //Contains Value
		 Hashtable h3 = new Hashtable();
		 
		h3.put("A", "Naveen");
		h3.put("B", "Manager");
		h3.put("C", "Selenium");
		if (h3.containsValue("Naveen"))
			System.out.println("Value is Found");
		
		
		// print all the values from hashtable using --Enumeration --elements
		// to print sequentially 
		
		Enumeration e = h3.elements();
		System.out.println("print values from h3");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// get all the values from hashtable using entrySet() -- set of hashtable values 
		
		System.out.println("print values using entrySet");
		
		Set s = h3.entrySet();
		System.out.println(s);
		
		 Hashtable h4 = new Hashtable();
		 
			h4.put("A", "Naveen");
			h4.put("B", "Manager");
			h4.put("C", "Selenium");
			
			if (h3.equals(h4))
		System.out.println("both are equal");
			
	// get the value from the key 
		System.out.println(h3.get("C"));
		
		//get the hashcode of hastable object 
		
		System.out.println("the hash code value of h3 : " + h3.hashCode());
		System.out.println("the hash code value of h4 : " + h4.hashCode());
		
	}
	

}

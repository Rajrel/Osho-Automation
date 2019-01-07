package com.javaCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
/* static array
		- size is fixed- 
		arryindexoutofboundsexcepiton-
		dno use to dynamic applications */
		
		int a[] = new int[3]; 
		a[0] = 10; 
		a[1] = 20; 
		a[2] = 30; 
		
		
/* Dynamic array = ArrayList
	1. we can store n number of values
	2. entertains duplicate values
	3. maintains insertion order
	4. it is not synchronized - slow not good for multi-threading
	5. allows random access to fetch the element because it stores the values on the basis of indexes
	6. We can define both primitive and non-primitive data types as well as class objects in  ArrayList
	
		 	
 */
		//Adding values
	ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		// Calculating the size or length of arraylist using size method
		//System.out.println(ar.size());
		
		ar.add(50);   
		ar.add(60);
		
		//System.out.println(ar.size());
		
		// can contain duplicate values
				ar.add(50);
				ar.add(12.33);
				ar.add("a");
				ar.add(true);
				//System.out.println(ar.size());
		
		//Random access to values 
				//System.out.println(ar.get(6));
		
		//use for loop/iterator to retrieve values from arraylist
		
		      /* for loop 
		for(int i =0; i<ar.size();i++) {
		System.out.println(ar.get(i));
			} */
				
				
		/* non generic vs generic 
		  - non defined array list is non-generic
		*/
		// This is generic because generics is defined as Integer - it won't allow adding other datatypes
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		// Add E to allow all types of values ArrayList<E> ar2 = new ArrayList<E>();
	
		
		//********************************************************************************	
		
		// How to store specific user defined class into an arraylist
	//Employee class objects
		
		Employee e1 = new Employee("Dhiraj", 40, "QA");
		Employee e2 = new Employee("Tom", 28, "Dev");
		Employee e3 = new Employee("Sachi", 35, "BA");
		
	// Create arrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		/* Using iterator to traverse the values
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		} */
		
	
	/*addAll() method - merges two arraylists 
		
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("Test");
	ar5.add("Selenium");
	ar5.add("QTP");
	
	ArrayList<String> ar6 = new ArrayList<String>();
	ar5.add("Java");
	ar5.add("Ruby");
	ar5.add("Groovy");
	
	ar5.addAll(ar6)	;
	
	for (int i = 0;i<ar5.size(); i++) {
		System.out.println(ar5.get(i)); 
	}
	*/	
	
		/* removeAll 
	ar5.removeAll(ar6); */
	
	//retainAll  - only common element will be printed from two arraylist
	ArrayList<String> ar7 = new ArrayList<String>();
	ar7.add("Test");
	ar7.add("Selenium");
	
	ArrayList<String> ar8 = new ArrayList<String>();
	ar8.add("Test");
	ar8.add("java");
	
	ar7.retainAll(ar8);
	
	for (int i = 0; i<ar7.size(); i++) {
		System.out.println(ar7.get(i));
	}
	  
}

}

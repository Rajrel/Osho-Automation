package com.javaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterfacePractice {

	public static void main(String[] args) {
		/* Map interface has a child interface SortedMap Interface 
		 * 		 ---(Under which there is NavigableMap interface and under which there is TreeMap class
		 * Map Interface has two classes HashTable and HashMap
		 Under HashMap three is LinkedHashMap extends HashMap
		 
		 */
// In Map, we store values in key:value pair
		
		/* Examples of Map
		 1. Error code (1.2.1:"fatal error")
		 2. map of Zip Codes (area-wise)
		 3. map of managers and employees
		 4. Test data Storage 
		 5. Configurations/Environmental variables
		 6. headers in Rest API
		 
		 Methods: 
		 1. put () ---add the value
		 2. putAll()
		 3.get(key)
		 4.containsKey(key)
		 5.remove(key)
		 6. keySet() ---
		 7.entrySet()
		 
		 */
		
		/* What is HashMap?
		 It is a class that implements Map Interface
		 It extends AbstractMap 
		 it contains only unique elements
		 stores elements/values in key:Value pair format
		 it may have one null key and multiple null values
		 it maintains no order
		 hashmap is non-synchronized - accessible to multiple threads - not thread safe
		 Concurrent modification exception - Fail-Fast condition when multiple threads attempt to modify a single HashMap
		 		 */
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Sachi");
		hm.put(2, "Ruchi");
		hm.put(3, "Prachi");
		
		//Fetching data from HashMap
		System.out.println(hm.size());
		System.out.println(hm.get(3));
		//it does not return arrayoutofboundexception
		
		System.out.println(hm.get(4));
		
		//print all the values 
		
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue() );
		}
		
		hm.remove(2);
		
		
		//maintains no order
		System.out.println(hm); //{1=Sachi, 3=Prachi}
		
		
		// How to store specific user defined class into an HashMap
		
		HashMap<Integer, Employee> emp = new HashMap <Integer, Employee>();
		
		
		Employee e1 = new Employee("Dhiraj", 40, "QA");
		Employee e2 = new Employee("Tom", 28, "Dev");
		Employee e3 = new Employee("Sachi", 35, "BA");
       
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
		// traverse the hashmap 
		
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key+ "Info");
			System.out.println(e.name + " "+ e.age + " " + e.dept);
		}
		
		
	}

}

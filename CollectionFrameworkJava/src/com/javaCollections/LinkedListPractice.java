package com.javaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// Special class - important in terms of pointers, references
		/* Every linked list has two things
		 - Head (points to first node data)
		 - Last next points to null value
		 		 */
		/* Singly linkedList (ed is silent while pronouncing)
			1. data|next (reference to next node) ->  data|Next  ->    data|Next
			next points to data but not vice-versa
		*/
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add 
		
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println(ll);
		
		//addFirst
		ll.addFirst("Dhiraj");
		ll.addLast("Automation");
		
		System.out.println(ll);
		
		//get 
		System.out.println(ll.get(3));
		
		//set 
		
		ll.set(0,"Tom");
		System.out.println(ll);
		
		//Remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		//remove based on index 
		ll.remove(2);
		System.out.println(ll);
		
		// How to print all the linkedlist
		
		     //for loop 
		
		/* for (int n = 0; n<ll.size();n++) {
			System.out.println(ll.get(n));  }*/
			
			// advance for loop or for each loop
			
			for (String str: ll) {
				System.out.println(str);
			}
			
			
			System.out.println("Using Iterator********************************");
			//using iterator
			
			Iterator<String> it = ll.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			}
			
			
			// while loop
			System.out.println("Using while loop ******************");
			int num=0;
			while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			}
			
			
			
		}
}

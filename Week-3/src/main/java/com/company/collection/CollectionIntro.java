package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*
 * The Collection API is a built in java hierarchy that provides
 * 		several classes, interfaces, and abstract classes that
 * 		relate to data structures.
 * 
 * 
 * 						Iterable (interface)
 * 							|	
 * 						Collection (interface)				Collections (class)	
 * 							|
 * 						   /|\
 * 						  / | \
 * 						 /  |  \
 * 					List   Set  Queue					Map					(all interfaces)
 * 			ArrayList	 TreeSet	Deque			   TreeMap
 * 			LinkedList	 HashSet	PriorityQueue	   HashMap
 * 		
 *  List:	allows duplicates & keeps order
 *  Set:	no duplicates & no order
 *  Queue:	First In First Out (FIFO)
 *  Map:	key-value pairs w/ unique keys, very fast and efficient
 * 			
 */
public class CollectionIntro {
	
	public static void main(String[] args) {
		
		//	An array list will create an array in memory and will continue to
		//		create more as it gets filled.
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(8);
		arr1.add(10);
		System.out.println(arr1);
		
		// nodes are created and linked together. They point to the node
		//		next to them and previous to them. This makes it more memory
		//		efficient as it only uses memory that it needs. It is also
		//		most efficient at performing operations on the end nodes.
		//		LinkedList implements List, but also implements Deque which 
		//		is a implementation of a double ended queue.
		LinkedList<String> link = new LinkedList<>();
		link.add("hello");
		link.add("world");
		System.out.println(link);
		
		
	}

}

package com.company.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

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
		System.out.println(link.size());
		
//		Iterator<String> i = link.listIterator();
//		System.out.println("iterator is next");
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		for(int j = 0; j<link.size(); j++) {
//			System.out.println(link.get(j));
//		}
		
		// enhanced for loop (for-each loop)  it uses the colon to 
		//		know it is a type iterating through an iterable
		for(String s : link) {
			System.out.println(s);
		}
		
		
		// using sets
		//	first the treeset
		//		the TreeSet will order the elements in the set
		TreeSet<String> tset = new TreeSet<>();
		tset.add("Jez");
		tset.add("Andrew");
		tset.add("Keata");
		tset.add("Jessica");
		tset.add("Aaron");
		tset.add("Star");
		tset.add("kyle");
		tset.add("!Francisco");
		System.out.println(tset);
		
		// next the hashset
		//	stores them as hashes to make it more efficient
		HashSet<Integer> hset = new HashSet<>();
		hset.addAll(arr1);
		hset.add(44);
		hset.add(7);
		hset.add(19);
		System.out.println(hset);
		
		
		//  maps
		//		the treemap
		//			make a dictionary!!! sorts with key value pairs
		TreeMap<String, String> dictionary = new TreeMap<>();
		dictionary.put("ark", "a boat");
		dictionary.put("code", "cold and unloving");
		dictionary.put("brat", "annoying");
//		dictionary.put(null, "no"); // dont do this!!!
		System.out.println(dictionary);
		
		
			// make an array sorted with no duplicates
		TreeSet<Integer> t = new TreeSet<>();
		t.addAll(Arrays.asList(43,2,4543,5555,345,233,3,43));
		System.out.println(t);
		
		
		
		
		
	}

}

package com.sapient.endur.ui;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * 
 * @author Admin
 * There is no default capacity for LinkedList.
 * A node has 3 members, 1 . to hold reference of previous node 2. to hold reference
 * of next node 3. to hold data.
 * 
 * Read operations are faster than write operations in ArrayList while in LinkedList write operations
 * are faster than read operations.
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> namesList= new LinkedList<>();
		namesList.add("Java EE"); // a node is created
		namesList.add("Javascript");// a new node is created and linked to previous node
		namesList.addFirst("Java");
		namesList.addLast("Hibernate");
		System.out.println(namesList.removeFirst());
		namesList.add("HTML5");
		namesList.add("CSS3");
		System.out.println("-------------------------");
		
		Iterator<String> iterator= namesList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}


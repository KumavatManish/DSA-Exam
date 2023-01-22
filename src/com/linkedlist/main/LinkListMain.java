package com.linkedlist.main;

import com.linkedlist.list.LinkedList;

public class LinkListMain {

	public static void main(String[] args) {
	
		LinkedList lst=new LinkedList();
		lst.addNewNode(70);
		lst.addNewNode(60);
		lst.addNewNode(80);
		lst.addNewNode(90);
		lst.addNewNode(75);
		System.out.println("");
		
		System.out.println("Elements present in list:");
		lst.displayList();
		System.out.println("");
		System.out.println("");	
		lst.deleteNode();
		lst.displayList();
		
		System.out.println("");
		System.out.println("");
		
		lst.deleteNode();
		lst.displayList();
		System.out.println("");
		System.out.println("");
        lst.peekNode();
        
	}

}

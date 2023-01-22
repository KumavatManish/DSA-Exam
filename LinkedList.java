package com.linkedlist.list;

public class LinkedList {
	
	private Node head;
	
	private class Node // Member inner Class
	{
	  private int data;
	  private Node next;
	
	  public Node(int data)
	  {
		this.data=data;	
	  }  
	}
	
//*************************************************************************  	

	public void addNewNode(int value) // Insertion (At Last Position)
	 {
		Node newNode=new Node(value); // step-1: Create new node
		
		if(head==null) // check list is empty or not
		{
			head=newNode;
			System.out.println("New Node Added");
			return;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		  
		temp.next=newNode; 
	// after reaching end, assign newly added node as the temp node's next 
		System.out.println("New node added at the end of the list...");
	}
	
//***************************************************************************
	
	public void deleteNode() // Deletion of Node at last position 
	{
		Node temp=null;
		Node prev=null;
		if(head==null) //  check Linkedlist is empty or not
		{
			System.out.println("The LinkedList is empty, can not show its nodes..");
		    return;
		}
		
		temp=head;
		prev=head;
		while(temp.next!=null) 
		{
			prev=temp;
	      	temp=temp.next;  
	      	
		}
		int top=temp.data;;
		prev.next=null;
		System.out.println("Top Node deleted having value :"+top);
	}
			
//**********************************************************************	
	public void displayList() // Display all node from the List
	{
		if(head==null) //  check Linkedlist is empty or not
		{
			System.out.println("The LinkedList is empty, can not show its nodes..");
		    return;
		}
		
		if(head.next==null) // check next node is available or not
		{
			System.out.println(head.data);
			return;
		}
		
		Node temp=head;  
		while(temp!=null) // Printing All node data
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
//**************************************************************************

	public void peekNode()
	{
	   Node temp=null;
		
		if(head==null) //  check Linkedlist is empty or not
		{
			System.out.println("The LinkedList is empty, can not show its nodes..");
		    return;
		}
		
		temp=head;
		while(temp.next!=null) 
		{
	      	temp=temp.next;   		
		}	
		System.out.println("Top Node peeked having value :"+temp.data);
	}
		
}

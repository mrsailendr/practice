package LinkedList;

import LinkedList.LinkedList.Node;

public class LinkedList {
	
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void push(int data)
	{
		Node new_node= new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	public void insertAfter(int data, Node prev_Node)
	{
		if(prev_Node==null)
		{
			System.out.println("Cannot be null");
			return;
		}
		
		Node new_node= new Node(data);
		new_node.next=prev_Node.next;
		prev_Node.next=new_node;
	}
	
	public void addAtEnd(int data)
	{
		Node new_node= new Node(data);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		
		temp.next=new_node;
		
		
	}
	
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void deleteNode(int key)
	{
		Node temp=head,prev = null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		
	if(temp==null)
		return;
	
	prev.next=temp.next;
		
		
		
	}
	
	void reverse()
    {
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null)
        {
        	next=curr.next;
        	curr.next=prev;
        	prev=curr;
        	curr=next;
        }
        
        head=prev;
    }
	
	public static void main(String[] arg)
	{
		LinkedList list=new LinkedList();
		list.push(12);
		list.push(45);
		list.push(43);
		list.push(45);
		list.push(43);
		
		list.push(435);
		list.push(443);
		list.deleteNode(43);
		list.printList();
		list.reverse();
		System.out.println("Reverse:");
		list.printList();
	}
	

}

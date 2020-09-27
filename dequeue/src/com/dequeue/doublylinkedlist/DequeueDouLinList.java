package com.dequeue.doublylinkedlist;

import java.util.Scanner;

public class DequeueDouLinList {
	
	class Node {
		
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
	}
	
	Node front = null;
	Node rear = null;
	
	void enqueueFront(int data)
	{
		Node node = new Node(data);
		
		
		if(front == null)
		{
			front = node;
			rear = node;
			System.out.println("Element is added at front");
		}
		else
		{
			node.next =front ;
			front.prev = node;
			front = node;
			System.out.println("Element is added at front else part");
			
		}
	}
	
void dequeueFront()
{
	if(front == null)
	{
		System.out.println("Queue is empty.");
	}else
	{
		Node temp = front.next;
		
		if(temp !=null)
		{
			temp.prev = null;
			front = temp;
			
			System.out.println("Element is removed at front");
			
		}else
		{
			front = null;
			rear =null;
			
			System.out.println("Element is removed at fron and Queue is Empty");
		}
		
	}
}
	void enqueueRear(int data)
	{
		Node node = new Node(data);
		
		if(rear == null)
		{
			front =node;
			rear=node;
			System.out.println("Element is addedd at rear");
		}else
		{
			
			node.prev = rear;
			rear.next = node;
			rear = node;
			
			System.out.println("Element is added at rear");
		}
	}
void dequeueRear()
{
	if(rear ==null)
	{
		System.out.println("Qeueue is Empty");
	}
	else
	{
		Node temp = rear.prev;
		if(temp == null)
		{
			front = null;
			System.out.println("Underflow");
		}else
		{
			temp.next = null;
			rear = temp;
			System.out.println("Element is removed at rear.");
		}
	}
	

}	void display()
{
	if(front == null)
	{
		System.out.println("Queue is empty");
	}else
	{
		Node temp = front;
		System.out.println("Values are");
		while(temp != null)
		{
			System.out.println(temp.data);
			temp =temp.next;
		}
	}
}
	


public static void main(String[] args)
{
	DequeueDouLinList deqDouLinkList = new DequeueDouLinList();
	
		
	
	char ch ;
	int choice;
	  System.out.println("********* Priority Queue operations *********\n");  
	    System.out.println("\n------------------------------------------------\n");  
	    do
	    {  
	        System.out.println("\nChose one from the below options...\n");  
	        System.out.println("\n1.EnQueueFront\n2.DeQueueFront\n3.EnqueueRear\n4.DequeueRear\n5.Show");  
	        System.out.println("\n Enter your choice \n");     
	        Scanner sc = new Scanner(System.in);
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	            	System.out.println("Enter the element to Enqueue at Front");
	            	deqDouLinkList.enqueueFront(sc.nextInt());
	                break;  
	            }  
	            case 2:  
	            {  
	            	deqDouLinkList.dequeueFront();  
	                break;  
	            }  
	            case 3:  
	            {  
	            	System.out.println("Enter the element to Enqueue at Front");
	            	deqDouLinkList.enqueueRear(sc.nextInt());
	                break;  
	            }  
	            case 4:  
	            {  
	            	deqDouLinkList.dequeueRear();
	                break;  
	            }  
	            case 5:  
	            {  
	            	deqDouLinkList.display();
	                break;  
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }  
	        }
	            System.out.println("\nDo you want to continue ? (Y/N)");
				Scanner acb = new Scanner(System.in);
				ch = acb.next().charAt(0);
			
	    }while (ch == 'y' || ch == 'Y');
	        
	    
}
	


}

package com.linklist;

import java.util.Scanner;

public class Controller {
	
	private static void printList(ListNode temp)
	{
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	
	private static ListNode makeList(int n, int arr[])
	{
		ListNode head=new ListNode(arr[0]);
		ListNode temp=head;
		for(int i=1;i<arr.length;i++)
		{
			temp.next=new ListNode(arr[i]);
			temp=temp.next;
		}
		
		return head;
	}
	
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		ListNode head=makeList(n, arr);
		printList(head);
		
		System.out.print("\n");
		head=ReverseList.reverseList(head);
		printList(head);
		
		sc.close();
	}
}

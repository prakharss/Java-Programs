package com.linklist;

public class ReverseList {
	public static ListNode reverseList(ListNode head)
	{
		ListNode prev=null,curr=head,temp;
		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;	
		}
		
		return prev;
	}
}

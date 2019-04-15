import java.util.Scanner;

//how collections are implemented internally
public class CollectionController {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={3,1,4,2};
		
		int val=sc.nextInt();
		if(val==0) //StringBuilder
		{
			String temp="Prakhar";
			StringBuilder str=new StringBuilder(temp);
			StringBuilderExample.print(str);
		}
		else if(val==1) //String
		{
			String str="Prakhar";
			StringExample.print(str);	
		}
		else if(val==2) //ArrayList
		{
			ArrayListExample.printList(arr);
		}
		else if(val==3) //LinkedList
		{
			LinkListExample.printList(arr);
		}
		else if(val==4) //Stack
		{
			StackExample.printList(arr);
		}
		else if(val==5) //Queue
		{
			QueueExample.printList(arr);
		}
		else if(val==6) //PriorityQueue - min and max
		{
			PriorityQueueExample.printList(arr);
		}
		else if(val==7) //ArrayDeque
		{
			ArrayDequeExample.printList(arr);
		}
		else if(val==8) //HashMap
		{
			HashMapExample.printList(arr);
		}
		else if(val==9) //TreeMap
		{
			QueueExample.printList(arr);
		}
		else if(val==10) //HashSet
		{
			QueueExample.printList(arr);
		}
		else if(val==11) //TreeSet
		{
			QueueExample.printList(arr);
		}
		
		sc.close();
	}
}

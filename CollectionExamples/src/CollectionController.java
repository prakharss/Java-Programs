import java.util.ArrayDeque;
import java.util.Scanner;

//how collections are implemented internally
public class CollectionController {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={3,1,4,2};
		
		int val=sc.nextInt();
		if(val==0) //String
		{
			
		}
		else if(val==1) //ArrayList
		{
			ArrayListExample.printList(arr);
		}
		else if(val==2) //LinkedList
		{
			LinkListExample.printList(arr);
		}
		else if(val==3) //Stack
		{
			StackExample.printList(arr);
		}
		else if(val==4) //Queue
		{
			QueueExample.printList(arr);
		}
		else if(val==5) //PriorityQueue - min and max
		{
			PriorityQueueExample.printList(arr);
		}
		else if(val==6) //ArrayDeque
		{
			ArrayDequeExample.printList(arr);
		}
		else if(val==7) //HashMap
		{
			HashMapExample.printList(arr);
		}
		else if(val==8) //TreeMap
		{
			QueueExample.printList(arr);
		}
		else if(val==9) //HashSet
		{
			QueueExample.printList(arr);
		}
		else if(val==10) //TreeSet
		{
			QueueExample.printList(arr);
		}
		
		sc.close();
	}
}

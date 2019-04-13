import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//implemented using LinkedList
//add, poll, peek ,size, clear
//see Queue.java class
public class QueueExample {
	static void printList(int arr[])
	{
		int i,n;
		n=arr.length;
		Queue<Integer> que=new LinkedList<>();
		for(i=0;i<n;i++)
			que.add(arr[i]);  
		
		//que.size() will also work [using LinkedList method]
		while(que.size()>0)
		{
			System.out.print(que.poll()+" "); 
		}
		
		for(i=0;i<n;i++)
			que.add(arr[i]);
		
		while(que.size()>0)
		{
			System.out.print(que.peek()+" ");
			que.poll(); 
		}
		
		for(i=0;i<n;i++)
			que.add(arr[i]);
		
		que.poll();
		que.remove(que.size()-1); //method of queue itself
		Iterator<Integer> itr=que.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		//clear the queue
		que.clear();
	}
}

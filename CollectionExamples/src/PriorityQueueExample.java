import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

//add, poll, peek, size, clear, remove, contains
public class PriorityQueueExample {
	static void printList(int[] arr) {
		int i,n;
		n=arr.length;
		
		//min heap
		PriorityQueue<Integer> pqmin=new PriorityQueue<Integer>(n);
		for(i=0;i<n;i++)
			pqmin.add(arr[i]);
		while(pqmin.size()>0)
		{
			System.out.print(pqmin.poll()+" ");
		}
		
		System.out.print("\n");
		for(i=0;i<n;i++)
			pqmin.add(arr[i]);
		while(pqmin.size()>0)
		{
			System.out.print(pqmin.peek()+" ");
			pqmin.poll();
		}
		
		System.out.print("\n");
		for(i=0;i<n;i++)
			pqmin.add(arr[i]);
		pqmin.remove(2);
		Iterator<Integer> itr=pqmin.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		pqmin.clear();
		
		//max heap for Integer
		Comparator<Integer> com = new Comparator<Integer>()
		{
			public int compare(Integer a,Integer b)
			{
				if(a>b)
					return -1;
				else
					return 1;
			}
		};
		
		PriorityQueue<Integer> pqmax=new PriorityQueue<Integer>(n,com);
		System.out.print("\n");
		for(i=0;i<n;i++)
			pqmax.add(arr[i]);
		while(pqmax.size()>0)
		{
			System.out.print(pqmax.poll()+" ");
		}
		
		//max heap for String
		Comparator<String> comstr = new Comparator<String>()
		{
			public int compare(String a,String b)
			{
				return b.compareTo(a);
			}
		};
		
		PriorityQueue<String> pqmaxstr=new PriorityQueue<String>(n,comstr);
		System.out.print("\n");
		pqmaxstr.add("Prakhar"); pqmaxstr.add("Topu");
		pqmaxstr.add("Krishna"); pqmaxstr.add("Himanshu");
		pqmaxstr.add("Rahul"); pqmaxstr.add("Gopu");
		while(pqmaxstr.size()>0)
		{
			System.out.print(pqmaxstr.poll()+" ");
		}
	}
}

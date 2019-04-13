import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
	static void printList(int arr[])
	{
		int i,n;
		n=arr.length;
		LinkedList<Integer> ls=new LinkedList<>();
		for(i=0;i<n;i++)
			ls.add(arr[i]);
		
		//using get
		for(i=0;i<n;i++)
			System.out.print(ls.get(i)+" ");
		System.out.print("\n");
		
		//using enhanced for loop
		ls.remove(ls.size()-1);
		for(Integer val:ls)
			System.out.print(val+" ");
		System.out.print("\n");
		
		//using iterator
		ls.remove(ls.size()-1);
		Iterator<Integer> itr=ls.iterator();
		//Iterator<Integer> itr=ls.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}

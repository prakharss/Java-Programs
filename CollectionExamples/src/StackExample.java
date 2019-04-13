import java.util.Iterator;
import java.util.Stack;

//push, pop, peek, empty, size, clear
//see Stack.java class 
public class StackExample {
	static void printList(int arr[])
	{
		int i,n;
		n=arr.length;
		Stack<Integer> stk=new Stack<>();
		for(i=0;i<n;i++)
			stk.push(arr[i]);  //ls.add(arr[i]) - vector method
		
		//stk.size() will also work [using vector method]
		while(stk.size()>0)
		{
			System.out.print(stk.pop()+" "); //this use peek function internally
		}
		
		for(i=0;i<n;i++)
			stk.push(arr[i]);
		
		while(!stk.empty())
		{
			System.out.print(stk.peek()+" ");
			stk.pop(); 
		}
		
		stk.pop();
		//using iterator
		Iterator<Integer> itr=stk.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		//to clear the stack
		stk.clear();
		
		/*public synchronized int search(Object o) {
	        int i = lastIndexOf(o);

	        if (i >= 0) {
	            return size() - i;
	        }
	        return -1;
	    }*/
		
		
		//works fine because of vector
		/*
		for(i=0;i<n;i++)
			stk.push(arr[i]);
			
		//using get
		for(i=0;i<n;i++)
			System.out.print(stk.get(i)+" ");
		System.out.print("\n");
		
		//using enhanced for loop
		stk.remove(stk.size()-1);
		for(Integer val:stk)
			System.out.print(val+" ");
		System.out.print("\n");
		*/
	}
}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the 
Deque interface. It is also known as Array Double Ended Queue or Array Deck. This is a special kind 
of array that grows and allows users to add or remove an element from both the sides of the queue. 

Few important features of ArrayDeque are as follows:
1) Array deques have no capacity restrictions and they grow as necessary to support usage.
2) They are not thread-safe which means that in the absence of external synchronization, ArrayDeque 
does not support concurrent access by multiple threads.
3) Null elements are prohibited in the ArrayDeque.
4) ArrayDeque class is likely to be faster than Stack when used as a stack.
5) ArrayDeque class is likely to be faster than LinkedList when used as a queue.
 */
//add, addFirst, addLast, getFirst, getLast, poll, pollFirst, pollLast, peek, peekFirst, peekLast, 
//clear, size
public class ArrayDequeExample {
	static void printList(int[] arr) {
		int i,n;
		n=arr.length;
		Deque<Integer> deque = new ArrayDeque<Integer>(n);
		
		for(i=0;i<n;i++)
			deque.add(arr[i]);
        for (Integer element : deque) 
        	System.out.print(element+" "); 
        System.out.print("\n"); 
        
        deque.clear(); 
        deque.addFirst(2); deque.addFirst(1); 
        deque.addLast(4); deque.addLast(3);
        Iterator<Integer> itr=deque.iterator();
        while(itr.hasNext())
        	System.out.print(itr.next()+" "); 
        System.out.print("\n");
        
        System.out.println(deque.getFirst()+" "+deque.getLast());
        
        deque.clear(); 
        deque.addLast(4); deque.addLast(3);
        deque.addFirst(2); deque.addFirst(1); 
        itr=deque.descendingIterator();
        while(itr.hasNext())
        	System.out.print(itr.next()+" "); 
        System.out.print("\n");
        
        System.out.println(deque.getFirst()+" "+deque.getLast());
	}
}

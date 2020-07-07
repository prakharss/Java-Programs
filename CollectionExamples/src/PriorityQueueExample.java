import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

//See comparator.comparing in 2nd example also
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
		
		PriorityQueue<Integer> pqmax = new PriorityQueue<Integer>(Collections.reverseOrder());
		//PriorityQueue<Integer> pqmax=new PriorityQueue<Integer>(n,com);
		//PriorityQueue<Integer> pqmax=new PriorityQueue<Integer>(com);
		//PriorityQueue<Integer> pqmax = new PriorityQueue<Integer>(n,Collections.reverseOrder());
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

/*
Kth Smallest Element in a Sorted Matrix
Problem Description
Given a sorted matrix of integers A of size N x M and an integer B. Each of the rows and 
columns of matrix A are sorted in ascending order, find the Bth smallest element in the
matrix. NOTE: Return The Bth smallest element in the sorted order, not the Bth distinct element.  

Problem Constraints
1 <= N, M <= 500 1 <= A[i] <= 109 1 <= B <= N * M  

*/

//We can do this in 3 optimised way
/*
n x m Matrix
1) n + b*log(n) (can be done only if columns are sorted)
2) m + b*log(m) (can be done only if rows are sorted)
3) much less than b*log(b) [log(1) + log(2) + log(3) + log(4) + .... log(B) (can be done only if rows and columns both are sorted)
*/

class Matrix {
    int val;
    int x;
    int y;
    
    Matrix(int val,int x,int y) {
        this.val=val;
        this.x=x;
        this.y=y;
    }
    
    int getValue() {
        return this.val;
    }
}

public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row=A.size();
        int col=A.get(0).size();
        
        PriorityQueue<Matrix> pq=new PriorityQueue<Matrix>(Comparator.comparing(Matrix::getValue));
        pq.add(new Matrix(A.get(0).get(0),0,0));
        
        int vis[][]=new int[row][col];
        for(int i=0;i<row;i++) 
            for(int j=0;j<col;j++) 
                vis[i][j]=0;
                
        for(int i=0;i<B-1;i++) {
            Matrix matrix=pq.poll();
            int x=matrix.x;
            int y=matrix.y;
            
            if(x+1<row && vis[x+1][y]==0) {
                pq.add(new Matrix(A.get(x+1).get(y),x+1,y));
                vis[x+1][y]=1;
            }
               
            if(y+1<col && vis[x][y+1]==0) {
                pq.add(new Matrix(A.get(x).get(y+1),x,y+1));
                vis[x][y+1]=1;
            }
        }
        
        return pq.peek().val;
    }
}

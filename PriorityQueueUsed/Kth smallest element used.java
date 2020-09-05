/*
Kth Smallest Element in a Sorted Matrix
Problem Description
Given a sorted matrix of integers A of size N x M and an integer B. Each of the rows and 
columns of matrix A are sorted in ascending order, find the Bth smallest element in the
matrix. NOTE: Return The Bth smallest elementTs in the sorted order, not the Bth distinct element.  

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
        
        PriorityQueue<Matrix> pq=new PriorityQueue<Matrix>(new Comparator<Matrix>() { 
            public int compare(Matrix a, Matrix b) 
            { 
                return a.val - b.val; 
            } 
        });
        //PriorityQueue<Matrix> pq=new PriorityQueue<Matrix>(Comparator.comparing(Matrix::getValue));
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
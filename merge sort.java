import java.util.Scanner;

public class Solution {
	static void doMerge(int a[],int l,int mid,int r)
	{
		int i,j,ind;
		int temp[]=new int[r-l+1];
		
		//l to mid and mid+1 to r - according to the recursion in line number 46 and 47
		i=l; j=mid+1; ind=0;
		while(i<=mid && j<=r)
		{
			if(a[i]<a[j])
			{
				temp[ind]=a[i];
				ind++; i++;
			}
			else
			{
				temp[ind]=a[j];
				ind++; j++;
			}
		}
		
		while(i<=mid)
		{
			temp[ind]=a[i];
			ind++; i++;
		}
		
		while(j<=r)
		{
			temp[ind]=a[j];
			ind++; j++;
		}
		
		for(i=l;i<=r;i++)
			a[i]=temp[i-l];
	}
	
	static void mergeSort(int a[],int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			
			doMerge(a,l,mid,r);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		mergeSort(a,0,n-1);
		
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		sc.close();	
	}
}

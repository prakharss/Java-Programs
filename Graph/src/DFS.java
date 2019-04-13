import java.util.ArrayList;
import java.util.List;

public class DFS {	
	static int vis[]=new int[100001];
	
	static void utilDFS(int i,List<Integer> ls[])
	{
		vis[i]=1; System.out.print(i+" ");
		for(int j=0;j<ls[i].size();j++)
		{
			if(vis[ls[i].get(j)]==0)
			{
				utilDFS(ls[i].get(j),ls);
			}	
		}
	}
	
	static void dfs(List<Integer> ls[],int vtx,int edge) 
	{
		int i;
		for(i=1;i<=vtx;i++)
		{
			if(vis[i]==0)
			{
				utilDFS(i,ls);
			}
		}
	}

}

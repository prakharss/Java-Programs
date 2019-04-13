import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphController {
	public static void main(String args[])
	{
		int vtx,edge,i,u,v;
		Scanner sc=new Scanner(System.in);
		
		vtx=sc.nextInt(); edge=sc.nextInt();
		List<Integer> ls[]=new ArrayList[vtx+1];
		
		for (i=1;i<=vtx;i++) {
            ls[i] = new ArrayList<Integer>();
        }
		
		for(i=0;i<edge;i++)
		{
			u=sc.nextInt();
			v=sc.nextInt();
			ls[u].add(v);
			ls[v].add(u);
		}
		
		DFS.dfs(ls,vtx,edge);
		sc.close();
	}	
}

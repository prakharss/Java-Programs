import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Util implements Comparable<Util> {
	String str;
	int marks;
	
	public int compareTo(Util obj)
	{
		if(this.marks>obj.marks)
			return 1;
		
		return -1;
	}
}

public class Solution {	
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		
		List<Util> ls=new ArrayList<Util>();
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			Util util=new Util();
			util.str=sc.next();
			util.marks=sc.nextInt();
			
			ls.add(util);
		}
		
		System.out.println();
		//natural sorting decided for Util class
		Collections.sort(ls);
		for(i=0;i<n;i++)
			System.out.println(ls.get(i).str+" "+ls.get(i).marks);
		System.out.println();
		
		Comparator<Util> comp=new Comparator<Util>() {
			@Override
			public int compare(Util o1, Util o2) {
				if(o1.marks<o2.marks)
					return 1;
				
				return -1;
			}
		};
		
		//we are doing custom sorting according to our need
		Collections.sort(ls,comp);
		for(i=0;i<n;i++)
			System.out.println(ls.get(i).str+" "+ls.get(i).marks);
		System.out.println();

		sc.close();	
	}
}

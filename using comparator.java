import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//how to compare strings
public class Solution {
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		String str[]=new String[n];
		for(i=0;i<n;i++)
			str[i]=sc.next();
		
		Comparator<String> obj=new Comparator<String>()
		{
			@Override
			public int compare(String s1, String s2) {
				return (s1+s2).compareTo(s2+s1);
			}
		};
		
		Arrays.sort(str, obj);
		for(i=0;i<n;i++)
			System.out.print(str[i]);
		
		sc.close();
	}
}

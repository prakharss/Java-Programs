import java.util.Scanner;

public class Solution {	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//String to Integer and Integer to String
		//toString method
		
		Integer i=new Integer(34);
		System.out.println(String.valueOf(i)+"val");
		System.out.println(i.toString()+"string");
		
		int x=323;
		System.out.println(((Integer)x).toString()+"x");

		//coolest way to convert primitive type of int to string
		String s=x+"";
		System.out.println(s);
		
		char ch[]=new char[4];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		String str=new String(ch);
		System.out.println(str);
		
		String str1="123";
		char ch1[]=str1.toCharArray();
		System.out.println(ch1[0]+" "+ch1[1]+" "+ch1[2]);
		
		int i2=Integer.parseInt(str1);
		System.out.println(i2+1);
		String str2="234";
		Integer i1=Integer.valueOf(str2);
		System.out.println(i1+1);
		
		sc.close();	
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		double d;
		long l;
		float f;
		char c;
		
		double xyz=1E9;
		int pqr=(int)1E9;
		
		int mx=Integer.MAX_VALUE;
		int mn=Integer.MIN_VALUE;
		float mx1=Float.MAX_VALUE;
		float mn1=Float.MIN_VALUE;
		
		int x=Integer.BYTES;
		
		System.out.println(mx + " " + mn + " " + mx1 + " " + mn1);
		System.out.println("double " + Double.SIZE/8 + " long " + Long.SIZE/8 + " float " + Float.SIZE/8);
		
		Scanner sc=new Scanner(System.in);
		d=sc.nextDouble();
		l=sc.nextLong();
		f=sc.nextFloat();
		c=sc.next().charAt(0);
		
		System.out.printf("float %.4f", f);
		sc.close(); 
	}
}

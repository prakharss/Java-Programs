import java.util.Scanner;

public class Solution {	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//type casting
		/*
		 *automatic conversion - char ---> int--->long 
		 *                                   | \/ |
		 *                                   | /\ |
		 *                                   |/  \|
		 *                                float--->double
		 *                                
		 *                                float--->long
		 *                                int--->double
		 *                                int--->float
		 *                                long--->double
		 */

		//float ff=4.5d; - Error: can not convert double to float automatically
		//float ff=4.5; - Error: can not convert double to float automatically
		float ff=(float)4.5;
		float ff1=4.5f;
		
		//automatic conversion of float to double
		double dd=4.5f;  
		double dd1=4.5d;
		double dd2=4.5;
		
		//int ii=4l; - Error: can not convert long to int automatically
		int ii=(int) 4l;
		long ll=3; //automatic conversion of int to long
		
		char ch='a';
		int ii1=ch; //automatic conversion of char to int
		System.out.println(ii1);
		
		int ii2=97;
		//char ch1=ii2; - Error: can not convert int to char automatically
		char ch1=(char)ii2;
		System.out.println(ch1);
		
		sc.close();	
	}
}

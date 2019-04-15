import java.util.Scanner;

class Student {
	int roll_number;
	String name;
	String stream;
	
	Student(int roll_number,String name,String stream)
	{
		this.roll_number=roll_number;
		this.name=name;
		this.stream=stream;
	}
}

class Teacher {
	int teacher_id;
	String name;
	String subject;
	
	Teacher(int teacher_id,String name,String subject)
	{
		this.teacher_id=teacher_id;
		this.name=name;
		this.subject=subject;
	}
	
	public String toString()
	{
		String str;
		str=this.teacher_id+" "+this.name+" "+this.subject;
		return str;
	}
}

public class Solution {	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student stu1=new Student(1,"Prakhar","CSE");
		Student stu2=new Student(2,"Rajat","IT");
		System.out.println(stu1);
		System.out.println(stu2);
		
		Teacher teach1=new Teacher(1,"Rohit","Maths");
		Teacher teach2=new Teacher(2,"Manoj","Science");
		System.out.println(teach1);
		System.out.println(teach2);
		
		int n=343;
		String str=n+""; 
		System.out.println(str.length()+" "+str);
		
		sc.close();	
	}
}

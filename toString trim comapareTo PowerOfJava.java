import java.util.*;

class Student implements Comparable<Student>
{
	String name;
	int roll;
	int marks;
	
	@Override
	public int compareTo(Student student) 
	{
		int m1=this.marks;
		int m2=student.marks;
		
		if(m1<m2)
			return 1;
		else if(m1>m2)
			return -1;
		
		return 0;
	}
	
	@Override
	public String toString()
	{
		return this.roll+" "+this.name+" "+this.marks;	
	}
}

public class Solution 
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		String temp[];
		
		Student student;
		List<Student> studentList=new ArrayList<Student>();
		
		n=sc.nextInt();
		sc.nextLine();
		for(i=0;i<n;i++)
		{
			temp=sc.nextLine().split(",");
			student=new Student();
			
			student.name=temp[0];
			//java lang.string.trim() is a built-in function that eliminates leading and trailing spaces 
			student.roll=Integer.parseInt(temp[1].trim());
			student.marks=Integer.parseInt(temp[2].trim());
			
			studentList.add(student);
			
		}
		
		Collections.sort(studentList);
		System.out.println();
		for(i=0;i<n;i++)
			System.out.println(studentList.get(i));
		
		sc.close();
	}
} 

/*
Sort on the basis of marks (name, roll, marks)

Input
4
Prakhar, 2, 90
Himanshu, 1, 95
Kirti, 4, 92
Krishna, 3, 88
 
Output 
1 Himanshu 95
4 Kirti 92
2 Prakhar 90
3 Krishna 88 
*/
/*
you have given name(String) and marks(String) of students - a name can come many time
find the name which have highest average in the class

4    
Prakhar 10
Himanshu 11
Prakhar 12
Himanshu 14

12.5
Himanshu
*/

import java.io.*;
import java.util.*;

class Student {
  String name;
  String marks;
}

class Solution {
  static String studentHavingHighestAvgMarks(Student arr[])
  {
    int n,i;
    n=arr.length;
    Map<String, Float> mpMarks=new HashMap<String, Float>();
    Map<String, Integer> mpCnt=new HashMap<String, Integer>();
    for(i=0;i<n;i++)
    {
      Float mark=Float.parseFloat(arr[i].marks);
      if(mpCnt.containsKey(arr[i].name))
      {
        mpCnt.put(arr[i].name,mpCnt.get(arr[i].name)+1);  
        mpMarks.put(arr[i].name,mpMarks.get(arr[i].name)+mark);
      }
      else
      {
        mpCnt.put(arr[i].name,1);  
        mpMarks.put(arr[i].name,mark);
      }
    }
    
    Float mx=Float.MIN_VALUE;
    String str="";
    for(String key:mpMarks.keySet())
    {
      float avg=mpMarks.get(key)/mpCnt.get(key);
      if(avg>mx)
      {
        str=key;
        mx=avg;
      }
    }
    
    System.out.println(mx);
    return str;
  }
  
  public static void main(String[] args) {
    int n,i;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    Student arr[]=new Student[n];
    for(i=0;i<n;i++)
      arr[i]=new Student();  
    
    for(i=0;i<n;i++)
    {
      arr[i].name=sc.next();
      arr[i].marks=sc.next();
    }
    
    System.out.print(studentHavingHighestAvgMarks(arr));
  }
}

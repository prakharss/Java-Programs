package com.java;  

class Parent{  
  void msg() throws Exception {System.out.println("parent");}  
}  
  
class TryCatchExample extends Parent{  
  void msg() throws Exception {  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
   Parent p=new TryCatchExample();  
   try {
	   p.msg(); 
   }
   catch(Exception e){
	   
   }
} 
}
package com.java;

public class FinalizeExample {
	public void finalize(){System.out.println("finalize called");}  
	
	@SuppressWarnings("unused")
	public static void main(String[] args){  
		FinalizeExample f1=new FinalizeExample();  
		FinalizeExample f2=new FinalizeExample();  
		f1=null;  
		f2=null;  
		System.gc();  
	}
}

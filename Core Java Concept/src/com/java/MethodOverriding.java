package com.java;

class A {
	int x=9;
	void show() {
		System.out.println("in A");
	}
}

class B extends A {
	
}

public class MethodOverriding {
	public static void main(String[] args)
	{
		B obj=new B();
		obj.show();
	}
}

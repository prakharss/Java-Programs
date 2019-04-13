package com.java;

class A {
	void show() {
		System.out.println("in A");
	}
}

class B extends A {
	void show() {
		System.out.println("in B");
	}
}

public class MethodOverriding {
	public static void main(String[] args)
	{
		A abc=new B();
		abc.show();
	}
}

package com.java;

class Hi extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

class Hello extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args)
	{
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		hi.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		hello.start();
	}
}

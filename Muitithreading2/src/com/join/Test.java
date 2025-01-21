package com.join;

public class Test {
public static void main(String[] args) throws InterruptedException {
	A t1=new A();
	t1.start();
	
	for(int i=1;i<10;i++)
	{
		System.out.println("main start");
	}
	t1.join();
	for(int i=1;i<10;i++)
	{
		System.out.println("main end");
	}
}
}

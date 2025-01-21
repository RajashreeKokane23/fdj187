package com.daemon;

public class Test {
public static void main(String[] args) {
	A t1=new A();
	t1.setDaemon(true);
	t1.start();
	for(int i=1;i<10;i++)
	{
		System.out.println("main start");
	}
}
}

package com.join;

public class A extends Thread {
public void run() {
	for(int i=1;i<1000;i++)
	{
		System.out.println("A");
	}
}
}

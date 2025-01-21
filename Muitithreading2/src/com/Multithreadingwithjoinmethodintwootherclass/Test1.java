package com.Multithreadingwithjoinmethodintwootherclass;

public class Test1 {
public static void main(String[] args) {
	A t1=new A();
	t1.start();
	try {
		t1.join();
	}catch(InterruptedException e1) {
		e1.printStackTrace();
	}
	for(int i=1;i<100;i++)
	{
		System.out.println("main");
	}try {
		Thread.sleep(300);
	}catch(InterruptedException e1) {
		e1.printStackTrace();
	}
}
}

package com.Multithreadingwithjoinmethodintwootherclass;

public class A extends Thread{
public void run() {
	B t2=new B();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=1;i<100;i++)
	{
		System.out.println("A");
		try {
			sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}

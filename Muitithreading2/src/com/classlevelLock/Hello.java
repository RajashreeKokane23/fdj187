package com.classlevelLock;

public class Hello {
public static synchronized void display(String msg) {
	System.out.println("[");
	System.out.println(msg);
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("]");
}
}

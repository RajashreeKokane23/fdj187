package com.Multithreadingwithjoinmethodintwootherclass;

public class B extends Thread {
public void run() {
	for(int i=101;i<300;i++) {
		System.out.println("B");
		try {
			sleep(300);
		}catch(InterruptedException e) {
		e.printStackTrace();
		}
	}
}
}

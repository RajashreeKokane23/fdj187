package com.runable;

public class Test2 {
public static void main(String[] args) {
	prime p=new prime(1,100);
	Thread t1=new Thread(p);
	t1.start();
}
}

package com.Synchronization;

public class Test {
public static void main(String[] args) {
	Hello h=new Hello();
	Mythread t1=new Mythread("java",h);
	Mythread t2=new Mythread("classes",h);
	t1.start();
	t2.start();
}
}

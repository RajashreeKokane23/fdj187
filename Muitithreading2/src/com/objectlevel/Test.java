package com.objectlevel;

public class Test {
public static void main(String[] args) {
	Hello h1=new Hello();
	Mythread t1=new Mythread("java",h1);
	Mythread t2=new Mythread("classes",h1);
	t1.start();
	t2.start();
}
}

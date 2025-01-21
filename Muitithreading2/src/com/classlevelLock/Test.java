package com.classlevelLock;

public class Test {
public static void main(String[] args) {
	Hello h=new Hello();
	Mythread t1=new Mythread("Java",h);
	Mythread t2=new Mythread("Classes",h);
	t1.start();
	t2.start();
}
}

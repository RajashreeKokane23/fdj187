package com.objectlevel;

public class Mythread extends Thread{
Hello h;
String msg;

public Mythread(String msg, Hello h) {
	this.h=h;
	this.msg=msg;
}
public void run() {
	h.display(msg);
}
}

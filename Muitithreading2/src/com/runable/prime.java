package com.runable;

public class prime implements Runnable {
	int st;
	int end;
	int temp=0;
	public prime(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	@Override
	public void run() {
		for(int i=st;i<=end-1;i++) {
			if(st%1==0);{
				//temp=temp+1;
			}
		}
	//	if(temp==0)
		//{
			System.out.println("Number is prime="+st);
		//}else {
			//System.out.println("Number is not prime="+st);
		}
		
	}
	

//}

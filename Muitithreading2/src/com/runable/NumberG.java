package com.runable;

public class NumberG  implements Runnable{
	int st;
	int end;
	public NumberG(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	@Override
	public void run() {
		for(int i=st;i<=end;i++)
		{
			System.out.println(i);
			i++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	}



import java.util.*;
class dis{
public synchronized void wish(String s)
{
	for(int i=0;i<5;i++)
	{
		System.out.println("Hello ");
		try{
			Thread.sleep(1000);		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(s);
	}
}
}
class MyThread extends Thread{
	dis d;
	String name;
	MyThread(dis d,String name){
		this.d=d;
		this.name=name;	
	}
	public void run(){
		d.wish(name);	
	}
}
class A{
	public static void main(String args[])
	{
		dis d=new dis();
		MyThread t1=new MyThread(d,"Kinshuk");
		t1.start();
		MyThread t2=new MyThread(d,"sub");
		t2.start();	
	}
}

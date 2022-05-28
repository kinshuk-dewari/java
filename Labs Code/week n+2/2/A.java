import java.util.*;
class dis{
public  static synchronized void wish(String s)
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
		dis d1=new dis();
		dis d2=new dis();
		MyThread t1=new MyThread(d1,"Kinshuk");
		t1.start();
		MyThread t2=new MyThread(d2,"sub");
		t2.start();	
	}
}

import java.util.*;
class X implements Runnable{
	public void run(){
		for(int i=0;i<10;i++)System.out.println(i);	
	}
}
class A{
	public static void main(String args[]){
		X x=new X();
		Thread t=new Thread(x);

		t.start();
		try{
			t.join();
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}

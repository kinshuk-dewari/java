import java.util.*;
//import java.lang;
class B extends Thread{
	public void run(){
		int i;
		for(i=1;i<=10;i++){
			System.out.println(i);
		}	
	}
}
class A
{
	public static void main(String args[]){
		B d=new B();
		d.start();
	}
}

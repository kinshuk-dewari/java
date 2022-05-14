import P1.*;
import P2.*;
import java.util.*;

class Code
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a number :");
		a=s1.nextInt();

		System.out.println("Enter another number :");
		b=s1.nextInt();
		
		C1 obj=new C1();

		System.out.println("Sum = "+obj.sum(a,b));
		System.out.println("Division = "+obj.div((float)a,(float)b));
		
		C2 obj1=new C2();
		System.out.println("Multiply = "+obj1.mult(a,b));
	}
}

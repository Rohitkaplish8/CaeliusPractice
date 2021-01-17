package net.codejava;

import java.util.*;

//This,final,super,static
class A
{
	int a =0;
	int b =0;
	static int c =0;
	final int e= 1;
	
    static void stat()
    {
    	System.out.println("Checking stat");
    }
	
	A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	final void fly()
	{
		
	}
	
	public void run()
	{
		 System.out.println("A");
	}
	public void run(int x)
	{
		 System.out.println("x");
		 this.run();
	}
}

final class ThankYou 
{

}

class B extends A
{

	B(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

public void run()
{
	 System.out.println("B");
	 super.run();
}
	
	
}


public class SFST {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the two numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	A h=new A(a,b);
	
	A.stat();
	int d= A.c;
		B x=new B(3,5);
		x.run();
		x.run(2);
	}

}

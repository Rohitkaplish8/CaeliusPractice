package code.netjava;

import java.util.Scanner;
import java.util.*;

abstract class Def 
{
	String string ="Welcome";
	abstract void one();
}

class Abc
{
	public String[] one(String[] arr)
	{
		return arr;
		
	}
}


public class StringPractice extends Def{

	public static void main(String[] args) {

		int n;
		StringPractice obj = new StringPractice();
		System.out.println(obj.string);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of string");
		n = sc.nextInt();
		
		String [] arr=new String [n];
		
		System.out.println("Enter the string elements");

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		Abc abc= new Abc();
		String [] arr1= abc.one(arr);
		

		for(int i=0;i<n;i++)
		{
			
			System.out.println(arr1[i]);

		}
		obj.one();
		
		
		StringBuffer sb=new StringBuffer("HelloWelcome");
		sb.append("Everyone");
		sb.insert(0,"Rohit");
		System.out.println(sb);
		
	}

	@Override
	void one() {
		System.out.println("Thank You");

		
	}

}

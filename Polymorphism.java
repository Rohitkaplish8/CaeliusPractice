package net.codejava;
import java.util.*;

//overloading 
/*
class Sum
{
	public void Sum(int a , String b)
	{
	    System.out.println(a+" "+b);

	}
	
	public void Sum(int a , int b)
	{
	    int c = a+b;
	    System.out.println(a+"+"+b+"="+c);
	}
	
}


public class Polymorphism {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
		int a=	sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		String string = "hello";
		
		Sum s = new Sum();
		
		s.Sum(a, b);
		s.Sum(a, string);
		
	}

}*/


//overriding

class Animal 
{
	public void eating()
	{
		System.out.println("eating");
	}
}

class Dog extends Animal
{
	public void eating()
	{
	System.out.println("barking");
	}
}

public class Polymorphism
{
	public static void main(String [] args)
	{
	Animal animal = new Animal();
	animal.eating();
	
	Dog dog = new Dog();
	dog.eating();
	
	Animal a = new Dog();
	a.eating();
	
	}
	
}








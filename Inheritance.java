package net.codejava;

import java.util.*;

/*
//Single Inheritance

class Animal
{
	String name;
	String type;

	Animal(String name , String type )
	{
		this.name = name;
		this.type = type;
	}
	
	public void jump()
	{
		System.out.println("Jump Now");
	}
	
}

class Dog extends Animal 
{
	
	Dog ( String name , String type)
	{
		super(name ,type);
	}
	
	public void speak()
	{
		System.out.println("Speak Now");

	}
	
	
}




public class Inheritance {

	public static void main(String[] args) {
		
		Dog d =new Dog ("tiger","Carnivore");
		d.speak();
		d.jump();
		
		
	}

}
*/

//Multilevel inheritance

/*
 class Animal 
{
	String name;
	String type;
	
	Animal ( String name ,String type)
	{
		this.name = name;
		this.type = type;
	}
	
	public void Intro()
	{
		System.out.println("Welcome");
	}
	
}
 
 class Dog extends Animal
 {
	 
	 Dog ( String name ,String type)
	 {
		 super(name,type);
	 }
	 
	 public void checkDog()
	 {
			 System.out.print("it is a"+" "+name+" "+","+type);
	 }
 }
 
 
 class Cat extends Dog
 {

	
	 
	 Cat ( String name ,String type)
	 {
		 super(name,type);		 
	 }
	 
	 public void checkCat()
	 {
			 System.out.print("it is a"+" "+name+" "+","+type);
	 }
 }
 
 class labrador extends Dog 
 {
	 
	 labrador ( String name ,String type)
	 {
		 super(name,type);
	 }
 }
 

public class Inheritance
{
	public static void main(String []args)
	{
		 String catName = "Cat";
		 String dogName = "Dog";
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String animalName = sc.nextLine();
		String animalType = sc.nextLine();
				
		Cat cat = new Cat(animalName,animalType);
		cat.Intro();
		
		if(animalName.matches(dogName) && animalType.matches("Herbivore") )
		{
			cat.checkDog();
			
		}
		else if (animalName.matches(catName)  && animalType.matches("Carnivore"))
		{
			cat.checkCat();
		}
		else
		{
			System.out.print("Not available");
		}
		sc.close();
		
		
	}
}

*/


//hierarchal 

/*
class Animal 
{
	
}

class one extends Animal 
{
	
}


class two extends Animal
{
	
}

public class Inheritance 
{
	public static void main(String []args)
	{
		
	}
}
*/












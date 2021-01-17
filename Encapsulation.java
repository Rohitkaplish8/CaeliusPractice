package net.codejava;
import java.util.*;


class GetterSetter
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
public void setName(String name)
{
	this.name = name;
}
public void setAge(int age)
{
	this.age = age;
}
}


public class Encapsulation {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name");
		String name = sc.nextLine();
		System.out.print("Enter age");
		int age = sc.nextInt();
		
		GetterSetter getset= new GetterSetter();
		getset.setAge(age);
		getset.setName(name);
		
		
		System.out.print(getset.getAge()+" "+getset.getName());
		
		
	}

}

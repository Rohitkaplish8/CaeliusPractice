package net.codejava;
import java.util.*;


class Switcher
{
	static int red=2;
	//final static int red=2;

	public int result (int num)
	{
		
		switch(num)
		{
		case 1:
			return 234;
		case 2:
			return 455;
			default:
				return 0;
		}
		
		
	}
	
	public static void yo()
	{
		System.out.print("Hello");

	}
	
}


public class SwitchCase {


	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		sc.close();
		Switcher s= new Switcher();  
		int b = s.result(num);
		
		System.out.print("And the number is :"+" "+b);

	    Switcher.yo(); //Static functionality 
		Switcher.red++;
		Switcher.red++;
		System.out.print(Switcher.red);

		
	}

}

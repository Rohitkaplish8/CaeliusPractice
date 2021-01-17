package net.codejava;

import java.util.*;

// A calculator and string concatenator implemented through switch case , 2 interface , multiple inheritance , abstract class , overriding and overloading concept



abstract class CheckNum
{
	static int num = 20;
	final int num2 = 40;
	
	abstract void validate();
	
	public void welcome()
	{
		System.out.println("Welcome to this program");

	}
}

class Controller extends CheckNum 
{

	@Override
	void validate() {

		System.out.print(true);
	}
	
	//overriding concept 
	public void intro ()
	{
		System.out.println("Hello from Controller class");

	}
	
	
}

class Learner extends Controller
{
	
	//overriding concept 
	public void intro ()
	{
		System.out.println("Hello from Learner class");

	}
	
	//overloading concept
	
	public void helloFast(String a)
	{
		System.out.println("Hello from helloFast class"+" "+a);

		
	}
	
	public void helloFast(String a,String b)
	{
		System.out.println("Hello from helloFast class"+" "+a.concat(b));

	}
	
	
}



public class PracticeOOPs extends CheckNum implements Calculate,StringAdder {

	public static void main(String[] args) {

	
		PracticeOOPs practiceoops = new PracticeOOPs();
		Controller controller = new Controller();
		Learner learner = new Learner();
		Controller l = new Learner();

		//overriding
		learner.intro();
		controller.intro();
		l.intro();
		
		//overloading
		learner.helloFast("Rohit");
		learner.helloFast("Rohit", "Kaplish");
		
		controller.welcome();
		practiceoops.validate();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String or Num");

		String choice = sc.nextLine();
		
		if(choice.matches("String"))
     {

			System.out.println("Enter the String to concat");

			String stringOne = sc.nextLine();
			String stringTwo = sc.nextLine();
			
			controller.validate();

			String resultString = practiceoops.concat(stringOne, stringTwo);
			
			System.out.println(resultString);

     }
		else if (choice.matches("Num"))
		
				{
			int result =0;
	        
			System.out.println("Enter the operation");
			String stringOp = sc.nextLine();
			
			System.out.println("Enter the numbers");
			int numOne = sc.nextInt();
			int numTwo = sc.nextInt();
			
			
			controller.validate();

			switch(stringOp)
			{
			case "Add":
				 result = practiceoops.add(numOne, numTwo);
					System.out.println(result);

				break;

			case "Sub":
				 result = practiceoops.sub(numOne, numTwo);
					System.out.println(result);


				break;

			case "Mul":
				 result = practiceoops.mul(numOne, numTwo);
					System.out.println(result);


				break;

			case "Div":
				 result = practiceoops.div(numOne, numTwo);
					System.out.println(result);


				break;
				
				default:
					System.out.println("Thank You");

					
			}
								
				}
				else
				{
					System.out.println("Not Available");
				}
		

		sc.close();
	}

	@Override
	public String concat(String a, String b) {
		// TODO Auto-generated method stub
		return a.concat(b);
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	void validate() {
		// TODO Auto-generated method stub
		System.out.println("Rohit kaplishsss");
	}

}







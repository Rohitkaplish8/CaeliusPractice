package net.codejava;

//public class ErrorHandling {
//
//	public static void main(String[] args) {

//		try
//		{
//			int n = 100/0;
//			
//		}
//		catch(Exception e)
//		{
//		System.out.print(e);	
//		}
//		finally
//		{
//			System.out.print("This code still works");	
//
//		}

//	}
//}


class Testing 
{
	
	
	public void m()
	{
		int a = 100/0;
		throw new ArithmeticException("Arithmetic error caught in function m()");
	}
	
	void n() 
	
	{
		m();
	}
}

public class ErrorHandling {

	public static void main(String[] args) {

		Testing obj= new Testing();
		
		try
		{
			obj.n();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled :"+e);
		}
		finally
		{
			System.out.println("Fianlly executed");

		}
		
	}
	}



package code.netjava;
import java.util.*;

class Hello
{
	
	public StringBuffer even(String str)
	{
	char[] arr=new char[str.length()];
		
	for (int i=0;i<str.length();i++)
	{
		 arr[i] =str.charAt(i);
	}
	
	char temp;
	
	for (int i=0;i<str.length()-1;i=i+2)
	{
		 temp = arr[i];
		 arr[i]=arr[i+1];
		 arr[i+1]=temp;
		
	}
	
	StringBuffer result=new StringBuffer();
	result.append(arr);
	
	
	return result;
	}
	
	public StringBuffer odd(String str)
	{
		char[] arr=new char[str.length()];
		
		for (int i=0;i<str.length();i++)
		{
			 arr[i] =str.charAt(i);
		}
		
		char temp;
		
		for (int i=0;i<str.length()-1;i=i+2)
		{
			 temp = arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
			
		}
		
		StringBuffer result=new StringBuffer();
		result.append(arr);
		
		
		return result;

	}
}


public class QuestionsPractice {
	
	public static void main(String[] args) {
	
		Hello obj =new Hello();
		String str = new String("Java");
		String str1 = new String("GeeksForGeeks");
		
		if(str.length() % 2 == 0 )
		{
		StringBuffer result= obj.even(str);
System.out.print(result);
		
		}
		else if(str.length() % 2 != 0 )
		{
			StringBuffer result=obj.odd(str1);
			System.out.print(result);
			System.out.print(result.length());
			
			

		}
		else
		{
			
		}
	}

}


//class Hello
//{
//
//	public String reverseFirstLast(String str)
//	{
//		System.out.print(str.length());
//		char [] arr = str.toCharArray();
//		char temp;
//		
//		for(int i =0;i<arr.length-1;i=i+2)
//		{
//			temp=arr[i];
//			arr[i]=arr[i+1];
//			arr[i+1]=temp;
//		}
//		
//		StringBuffer stb= new StringBuffer();
//		stb.append(arr);
//		str= stb.toString();
//		
//		return str;
//		
//	}
//	
//	
//}
//
//
//
//
//public class QuestionsPractice {
//	
//	public static void main(String [] args)
//	{
//		String str = new String("GeeksForGeeks");
//		String str1 = new String("Java");
//		
//	Hello obj = new Hello();
//	String result = obj.reverseFirstLast(str);
//	System.out.print(result);
//
//	}
//}
//
//
//

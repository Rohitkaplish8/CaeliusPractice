package code.netjava;
import java.util.*;

class FuncCheck
{
	public void cases()
	{
		
	String str="Rohit Kaplish";
	String str1 = new String("Rohit Kaplish");
	String str2= new String("Rohit Kaplish");
	
	System.out.println("Trim : "+str1.trim()); //removes space end and start 
	System.out.println("substring : "+" "+str1.substring(0,3));
	System.out.println("substring : "+" "+str1.toLowerCase());
	System.out.println("substring : "+" "+str1.toUpperCase());
	System.out.println("substring : "+" "+str1.startsWith("R"));
	System.out.println("substring : "+" "+str1.endsWith("R"));
	System.out.println("substring : "+" "+str1.replace("Rohit","Rohitsss"));
	System.out.println("substring : "+" "+str1.charAt(2));
	System.out.println("substring : "+" "+str1.compareTo(str2));
	System.out.println("substring : "+" "+str1.contains("Roh"));
	System.out.println("substring : "+" "+str1.equalsIgnoreCase(str2));
	System.out.println("substring : "+" "+str1.charAt(2));
	}
}


public class StringReverse {

	public static void main (String args[]) {

		FuncCheck fc = new FuncCheck();
		java.lang.String str="My name is rohit kaplish";
		
		char temp;
		char [] arr= str.toCharArray();
		char [] arr1= new char[str.length()];
		
		int j= str.length()-1;
		
		for(int i =0;i<str.length();i++)
		{
			arr1[i]=arr[j];
			j--;
		}
		
		StringBuffer stb = new StringBuffer();
		stb.append(arr1);
		stb.toString();
		
		System.out.print(stb);
		fc.cases();
		
	}

}

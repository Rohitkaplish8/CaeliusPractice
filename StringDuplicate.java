package code.netjava;

import java.util.*;

class Programs
{
	public String removeDuplicates(String str)
	{
		
		char strArray[]=str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		int j=0;
		int flag =0;
		char pivot;
		
		for(int i=0;i<strArray.length;i++)
		{
			if(strArray[i]!=strArray[j])
			{
				
			}
		}
		
		
		return sb.toString();
	}
	
	
}


public class StringDuplicate {

	public static void main(String[] args) {

		String str;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
		str=sc.nextLine();
		
		Programs obj = new Programs();
		String result= obj.removeDuplicates(str);
        System.out.println(result);

        
        int []arr = new int[10];
        int []arr1 = new int[10];
        
        for(int i =0;i<10;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        int flag=0;
        int e=0;
        for(int i =0;i<arr.length;i++)
        {
        	for(int j =i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
                 flag =1;
        		}
        		else
        		{
        			flag =0;
        		}
        	}
        	if(flag ==0)
        	{
        		arr1[e]=arr[i];
        		e++;
        	}
        }
        
        for(int i =0;i<10;i++)
        {
        	System.out.println(arr1[i]);
        }
        
        
	}

}

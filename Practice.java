package net.codejava;
import java.util.*;

public class Practice {

	public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        n = sc.nextInt();
		
		int  []arr = new int[n];


        System.out.println("Enter elements");
		
        for (int i = 0 ;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        int j=n-1;
        int temp=0;
        
        if(n % 2== 0)
        {
        	 for(int i =0 ;i<n;i++)
             {
             	
        		 temp = arr[i];
             	arr[i]=arr[j];
             	arr[j]=temp;
             			j--;
             			temp=0;
             	if(i==j)
             	{
             		break;
             	}
             	
             	
             	
             }
             
             
        }
        
        else
        {
        	 for(int i =0 ;i<n;i++)
             {
             	
        		 temp = arr[i];
              	arr[i]=arr[j];
              	arr[j]=temp;
              			j--;
              			temp=0;
              	if(i>j)
              	{
              		break;
              	}
             	
             	
             }
             
             
        }
       
        for (int i = 0 ;i<n;i++)
        {
        	   System.out.println(arr[i]);
        }
		
		
	}

}

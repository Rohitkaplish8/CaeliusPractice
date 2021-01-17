package code.netjava;

import java.util.*;

class WorkSpace
{
	
	public void arrMax(int arr[],ArrayList <Integer> arrList)
	{

	int max =arr[0];
	int j=0;
	int i;
	
	for(i = 0; i<arr.length ;i++)
	{
		j=0;
		
		while(j!=arr.length)
		{
	    if(arr[i] < arr[j] )
	     {
	    if(arr[j]>max)
	    {
		  max = arr[j];
	    }
		 // System.out.println("iteration:"+"i: "+i+"j: "+j+" "+"max:"+max);
	     }
		 // System.out.println("iteration:"+"i: "+i+"j: "+j+" "+"max:"+max);
		j++;
		}
	}
	
	System.out.println(max);
}


public void arrRemoveDuplicate(int arr[],ArrayList <Integer> arrList)
{
	
}
}




public class ArrayPrograms {
		
	public static void main(String[] args) {

		int n;
		
		Scanner sc = new Scanner(System.in);
		WorkSpace obj = new WorkSpace();
		
		System.out.println("Enter the no of arr elements");
		n= sc.nextInt();
		
		int [] arr = new int[n];
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		 
        for(int i =0;i<n;i++)
        {
        	int a=sc.nextInt();
            
        	arr[i]=a;
        	arrList.add(a);
        }       
		
		obj.arrRemoveDuplicate(arr,arrList);
		
		
		
	}

}

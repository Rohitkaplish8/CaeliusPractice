package code.netjava;
import java.util.*;

 class Test
{
	public void arrReverse(int [] arr,ArrayList<Integer>arrList)
	{
		Collections.reverse(arrList);
		for(int h =0;h<arrList.size();h++)
		{
			System.out.println(arrList.get(h));
		}
		
		int temp=0;
		int j =arr.length-1;
		
		if(arr.length % 2 ==0)
		{
		for(int i =0;i<arr.length;i++)
		{
			if(i>j)
			{
				break;
			}	
			
		temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j--;

		
		}
		}
		else
		{
			for(int i =0;i<arr.length;i++)
			{
				if(i==j)
				{
					break;
				}	
				
			temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;

			
			}
		}
		for(int h =0;h<arrList.size();h++)
		{
			System.out.println(arr[h]);
		}
		
	}
}



public class YoPractice
{
		
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = sc.nextInt();
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
	    int arr[] = new int[n];
		
		 
        for(int i =0;i<n;i++)
        {
        	int a=sc.nextInt();
        	arr[i]=a;
        	arrList.add(a);
        }       
        
	    Test obj = new Test();
	    obj.arrReverse(arr,arrList);
	}
}


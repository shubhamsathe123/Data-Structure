package Array;

import java.util.Scanner;

public class BinarySearch {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();	
		}		
		System.out.println("enter the searching element");
		int search=s.nextInt();
		//logic
		int start=0,end=n-1,mid=(start+end)/2;
		while(start<=end)
		{
			
			if(search>arr[mid])
			{
				start=mid+1;
			}
			else if(search == arr[mid]) {
				System.out.println("element found");
				break;
			}
			else
			{
				end=mid-1;
				
			}
			mid=(start+end)/2;
		}
		if(start>end)
		{
			System.out.println("element not found");
		}
}
}

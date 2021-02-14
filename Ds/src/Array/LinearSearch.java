package Array;

import java.util.Scanner;

public class LinearSearch {
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
		
		for(int i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				System.out.println("element found at index"+i);
			}
		}
	}

}

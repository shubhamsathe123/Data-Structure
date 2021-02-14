package Array;

import java.util.Scanner;

public class MissingElement {
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
		
		for(int i=0;i<n;i++)
		{
			if(arr[i+1]-arr[i]!=1)
			{
				System.out.println("missing element is"+(arr[i]+1));
			}
				
		}
	}

}

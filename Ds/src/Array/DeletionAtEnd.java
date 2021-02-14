package Array;

import java.util.Scanner;

public class DeletionAtEnd {
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
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		n--;
		System.out.println("new array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

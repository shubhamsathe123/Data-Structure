package Array;

import java.util.Scanner;

public class InsertionAtMiddle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int arr[]=new int[n+1];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();	
		}
		System.out.println("enter thye position where u want to insert");
		int pos=s.nextInt();
		System.out.println("enter the element ");
		int insert=s.nextInt();
		
		for(int i=n-1;i>=(pos-1);i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=insert;
		n++;
		
		System.out.println("new array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}

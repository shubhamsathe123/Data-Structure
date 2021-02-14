package Array;

import java.util.Scanner;

public class Sorting1 {
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
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			 if(arr[i]>arr[j])
			 {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 }
			}
		}
		System.out.println("ascending array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}	
	}

}

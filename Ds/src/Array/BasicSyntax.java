package Array;

import java.util.Scanner;

public class BasicSyntax {
 public static void main(String[] args) {
	System.out.println("Enter the size of array");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] arr=new int[n];
//	int arr1[]= {1,2,3,4,56,9};
//	
//	for(int j=0;j<arr1.length;j++)
//	{
//		System.out.println(arr1[j]);
//	}
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("reverse array is");
	for(int i=n-1;i>=0;i--)
	{
		System.out.print(arr[i]+",");
	}
 }
}

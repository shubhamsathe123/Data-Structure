//sum 0f square
package Array;

import java.util.Scanner;

public class Summation {

	//sum of the even numbers
	public static void even(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of the even array element is "+sum);
	}
 public static void main(String[] args) {
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
		
	}
	Summation.even(arr);
	
	//sum of the square
	for(int i=0;i<n;i++)
	{
		sum=sum+(arr[i]*arr[i]);
	}
	System.out.println("sum of the square of the array is: "+sum);
}
}

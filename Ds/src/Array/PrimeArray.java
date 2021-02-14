package Array;

import java.util.Scanner;

public class PrimeArray {
	public static void prime(int[] arr)
	{
		int count=0;
		System.out.println("prime array is");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<=arr.length;j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(arr[i]+",");
			}
			count=0;
		}
	}
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
		PrimeArray.prime(arr);
	}

}

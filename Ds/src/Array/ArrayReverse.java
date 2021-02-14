//Reverse the array  using second array
package Array;

import java.util.Scanner;

public class ArrayReverse {
	
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();	
		}
		//logic(method 1)
		for(int i=n-1,j=0;i>=0;i--,j++)
		{
			arr1[j]=arr[i];
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(arr1[j]);
		}
}
}

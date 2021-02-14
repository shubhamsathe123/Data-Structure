//inserting element at the end
package Array;

import java.util.Scanner;

public class InsertionAtEnd {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=s.nextInt();
	int arr[]=new int[n+1];
	System.out.println("enter the array elemnts");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("enter the elemnt that you want to insert");
	int insert=s.nextInt();
	arr[n]=insert;
	n++;
	System.out.println("new array is");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}
}

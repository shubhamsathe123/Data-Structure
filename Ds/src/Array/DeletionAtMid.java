//program to delete array element from the entered position
package Array;

import java.util.Scanner;

public class DeletionAtMid {
 public static void main(String[] args) {

	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the number of array elements");
	 int n=s.nextInt();
	 int arr[]=new int[n];
	 
	 System.out.println("enter the array elements");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=s.nextInt();
	 }
	 System.out.println("enter the position from where you want to delete the array element ");
	 int pos=s.nextInt();
	 
	 for(int i=pos;i<n;i++)
	 {
		 arr[i-1]=arr[i];
	 }
	 n--;
	 System.out.println("new array is");
	 for(int i=0;i<n;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 
}
}

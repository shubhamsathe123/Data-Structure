//java program to insert array element at the starting position
package Array;
import java.util.Scanner;
public class InsertionStart {
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
		
		System.out.println("enter the element that you want to insert");
		int insert=s.nextInt();
		
		for(int i=n-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=insert;
        n++;
		
		
		System.out.println("array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

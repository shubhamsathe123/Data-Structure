/*
 
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
 
 */

package Patterns;

public class Pattern8 {
  public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}

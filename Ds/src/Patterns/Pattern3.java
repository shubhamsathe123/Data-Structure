/*
 
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 

 */

package Patterns;

public class Pattern3 {
  public static void main(String[] args) {
	for(int i=5;i>=1;i--)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}

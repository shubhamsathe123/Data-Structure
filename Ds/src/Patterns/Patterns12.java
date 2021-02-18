/*
 
    4
   34
  234
 1234

 */
package Patterns;

public class Patterns12 {
 public static void main(String[] args) {
	for(int i=4;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=4;k++)
		{
			System.out.print(k);
		}
		System.out.println();
	}
}
}

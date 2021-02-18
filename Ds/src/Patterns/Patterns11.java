/*
    4
   43
  432
 4321
 */
package Patterns;

public class Patterns11 {
	public static void main(String[] args) {
		for(int i=4;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}

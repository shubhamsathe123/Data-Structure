/*
   *
  ***
 *****
*******
 */

package Patterns;

public class Pyramid3 {
	public static void main(String[] args) {
		int z=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=z;k++)
			{
				System.out.print("*");
			}
			z=z+2;
			System.out.println();
		}
	}

}

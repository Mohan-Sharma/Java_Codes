package org.msharma.noviceproblems.exception.Exercise;

/**
 * Print pyramid like
 * 1
 * 12
 * 123
 * 1234
 * 123
 * 12
 * 1
 */
class PyramidTest
{
	public static void main(String arr[])
	{
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int k=5;k>0;k--)
		{
			for(int l=1;l<k;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
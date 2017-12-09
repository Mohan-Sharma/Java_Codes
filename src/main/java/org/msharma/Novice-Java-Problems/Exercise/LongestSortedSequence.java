import java.util.*;
class LongestSortedSequence
{
	public static void main(String arr[])
	{
		int inputArr[]=new int[]{7,2,3,1,5,8,9,6};
		int sequenceArr[]=new int[inputArr.length];
		for(int i=1;i<inputArr.length;i++)
		{
			int max=0;
			for(int j=0;j<i;j++)
			{
				if(inputArr[j]<inputArr[i] && sequenceArr[j]>max)
				{
					max=sequenceArr[j];
				}
			}
			sequenceArr[i]=max+1;
		}
		int max1=0;
		for(int i=0;i<sequenceArr.length;i++)
		{
			if(sequenceArr[i]>max1)
			{
				max1=sequenceArr[i];
			}
		}
		System.out.println(max1);
	}
}
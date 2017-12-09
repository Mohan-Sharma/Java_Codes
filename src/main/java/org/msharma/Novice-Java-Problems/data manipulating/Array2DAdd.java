class Array2DAddAlgo
{
public static int[][] add(int a[][],int b[][])
{
int c[][]=new int[b.length][b[0].length]; 
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
c[i][j]=a[i][j]+b[i][j];
}
return c;
}
}
class Array2DAdd
{
public static void main(String arr[])
{
int m1[][]={{2,3,4},{6,7,8},{3,4,7}};
int m2[][]={{5,1,0},{9,2,5},{1,3,6}};

System.out.println("Matrix m1 is:");
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
System.out.print(m1[i][j]+"\t");
}
System.out.println("Matrix m2 is:");
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
System.out.print(m2[i][j]+"\t");
}
int m3[][]=Array2DAddAlgo.add(m1,m2);
System.out.println("Resultant matrix of the sum of m1 and m2 is:");
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
System.out.print(m3[i][j]+"\t");
}
}
}
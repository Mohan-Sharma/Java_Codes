class Array2DMultiplyAlgo
{
public static int[][] multiply(int a[][],int b[][])
{
int c[][]=new int[a.length][a[0].length];
for(int i=0;i<a.length;i++);
{
System.out.println();
for(int j=0;j<b.length;j++)
c[i][j]=a[i][j]*b[i][j];
}
return c;
}
}
class Array2DMultiply
{
public static void main(String arr[])
{
int m1[][]={{2,3,4},{6,7,8}};
int m2[][]={{5,1},{9,2},{1,3}};
System.out.println("Matrix m1 is:");
for(int i=0;i<2;i++)
{
System.out.println();
for(int j=0;j<3;j++)
System.out.print(m1[i][j]+"\t");
}
System.out.println("Matrix m2 is:");
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<2;j++)
System.out.print(m2[i][j] +"\t");
}
int m3[][]=Array2DMultiplyAlgo.multiply(m1,m2);
System.out.println("Resultant matrix of product of m1 & m2:");
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
System.out.print(m3[i][j]+"\t");
}
}
}
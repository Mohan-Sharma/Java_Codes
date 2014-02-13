import java.util.Scanner;
class TransposeMatrix
{
public static void main(String arr[])
{
int a[][],b[][];
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows");
int row=in.nextInt();
System.out.println("Enter the number of columns");
int col=in.nextInt();
a=new int[row][col];
b=new int[row][col];
System.out.println("Enter the elements of the matrix");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
a[i][j]=in.nextInt();
}
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
b[i][j]=a[j][i];
}
}
System.out.println("The matrix is:");
for(int i=0;i<row;i++)
{
System.out.println();
for(int j=0;j<col;j++)
System.out.print(a[i][j]+"\t");
}
System.out.println("Its transpose:");
for(int i=0;i<col;i++)
{
System.out.println();
for(int j=0;j<row;j++)
System.out.print(b[i][j]+"\t");
}
}
}

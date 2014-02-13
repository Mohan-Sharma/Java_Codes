class ArrayRev
{
public static void main(String arr[])
{
int m=arr.length/2;
int j=arr.length-1;
for(int i=0;i<m;i++)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
j--;
}}
}
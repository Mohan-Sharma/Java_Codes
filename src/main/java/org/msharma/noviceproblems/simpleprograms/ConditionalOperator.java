import java.util.*;
class ConditionalOperator
{
public static void main(String arr[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the first no");
int n=in.nextInt();
System.out.println("Enter the second no");
int x=in.nextInt();
boolean someCondition=false;
int result=(n<x)?n:x;
//int result=(someCondition)?n:x;
System.out.println(result+" minimal value");
//System.out.println(result);
}
}
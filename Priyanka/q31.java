//package Priyanka;
import java.util.*;
public class q31
{
static int array()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int i;
int[]arr= new int[n];
int d,t,count=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for( i=0;i<n;i++)
{
int sum=0;
t=arr[i];
while(arr[i]>0)
{  
d=arr[i]%10;
sum=sum*10+d;
arr[i]=arr[i]/10;
}

if(t==sum)
{
count++;
}
}
if(count==n)
{
return 1;
}
else
{
return 0;
}
}
public static void main(String[] args) 
{
    int r = array();
    System.out.println(r);
}
}

package Priyanka;
public class q3
{
public static void main(String[] args)
{ 
for(int i=5;i>0;i--)
{

for(int j=1;j<=5-i;j++)

{
System.out.print(" ");
}
if(i==1 || i==5)
for(int j=1;j<=i*2-1;j++)

{
System.out.print("*");
}
else
{
for(int j=1;j<=i*2-1;j++)

{ 
if(j==1 || j==i*2-1)
System.out.print("*");
else

System.out.print(" ");
}
}
System.out.println();
} 
}
}
//package Patterns;
public class Pattern3 
{
  public static void main(String[] args) 
  {
    int i,j,k;
    for(i=1;i<=4;i++)
    {
        for(j=0;j<=4-i;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            if(j==1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        for(j=2;j<=i;j++)
        {
            if(j==i)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
        if(i==4)
        {
            for(k=1;k<=5;k++)
            {
            System.out.print("* ");
            }
        }
    }
  }  
}

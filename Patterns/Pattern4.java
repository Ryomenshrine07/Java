package Patterns;

public class Pattern4 
{
  public static void main(String[] args) 
  {
    int i,j;
    for(i=1;i<=8;i++)
    {
        for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=8;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }  
}

package Patterns;

public class Patterns 
{
  public static void main(String[] args) 
  {
    int i,j;
    for(i=1;i<=8;i++)
    {
        for(j=1;j<=8-i;j++)
        {
           System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        
    }
  }  
}

package Priyanka;

public class q2 
{
  public static void main(String[] args) 
  {
    int i,j;
    for(i=1;i<=5;i++)
    {
      for(j=1;j<=5-i;j++)
      {
        System.out.print(" ");
      }
      for(j=1;j<=i;j++)
      {
        System.out.print(i);
      }
      for(j=2;j<=i;j++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
  }  
}
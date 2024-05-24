package Priyanka;
public class q4 
{
   public static void main(String args[])
  {
    int i,j;
    for(i=1;i<=5;i++)
    {
      for(j=1;j<=9;j++)
      {
        if(i==1||i==5||j==1||j==9)
          System.out.print("*");
        else
          System.out.print(" ");
      }
 
      System.out.println();
    }
  }
}

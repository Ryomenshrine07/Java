package Priyanka;
public class q5 
{
    public static void main(String[] args)
    {
      int i, j;
      for(i=1;i<=4;i++)
      {
          for(j=1;j<=5-i;j++)
          {
              System.out.print(" ");
          }
          for(j=2;j<=i;j++)
          {
              System.out.print("A");
          }
          for(j=1;j<=i;j++)
          {
              System.out.print("A");
          }
          System.out.println();
      }
      for(i=1;i<=5;i++)
    {
        for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=4;j>=i;j--)
        {
            System.out.print("A");
        }
        for(j=5;j>=i;j--)
        {
            System.out.print("A");
        }
        System.out.println();
    }
    }  
}

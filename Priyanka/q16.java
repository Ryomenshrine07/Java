package Priyanka;

public class q16 
{
    public static void main(String[] args)
    {
      int i, j;
      char ch='A';
      for(i=1;i<=5;i++)
      {
          for(j=1;j<=5-i;j++)
          {
              System.out.print(" ");
          }
          for(j=2;j<=i;j++)
          {
              System.out.print(ch);
          }
          for(j=1;j<=i;j++)
          {
              System.out.print(ch);
          }
          ch++;
          System.out.println();
      }
      ch='A';
      for(i=1;i<=5;i++)
    {
        for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=4;j>=i;j--)
        {
            System.out.print(ch);
        }
        for(j=5;j>=i;j--)
        {
            System.out.print(ch);
        }
        ch++;
        System.out.println();
    }  
}
}

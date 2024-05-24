package Priyanka;
public class q18
{
    public static void main(String[] args) 
    {
      int i,j;
      for(i=1;i<=3;i++)
      {
        for(j=i;j<=3-1;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        for(j=i-1;j>=1;j--)
        {
            System.out.print(j);
        }
       System.out.println();
      }  
    } 
}


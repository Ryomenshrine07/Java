package Priyanka;

public class q17 
{
  public static void main(String[] args) 
  {
    int i,j,p=5;
    for(i=1;i<=5;i++)
    {
        for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=5;j>=i;j--)
        {
            System.out.print(p);
            p--;
        }
        p=5-i;
        System.out.println();
    }
  }  
}

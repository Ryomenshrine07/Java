package Priyanka;

public class q11 
{
  public static void main(String[] args) 
  {
    int i,j;
    char ch='G';
    for(i=1;i<=7;i++)
    {
        for(j=2;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(j=7;j>=i;j--)
        {
            System.out.print(ch);
        }
        ch--;
        System.out.println();
    }
  }  
}

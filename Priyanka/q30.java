import java.util.Scanner;

public class q30 
{
  public static void main(String[] args) 
  {
    int i,j,a=2;
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==1||i==n)
            {
                if(j%2==0)
                System.out.print("1");
                else
                System.out.print(" ");
            }
            else
            {
                if(j==n)
                {
                    a--;
                    System.out.print(a);
                }
                else
                {
                System.out.print(a);
                a++;
                }
            }
        }
        System.out.println();
    }
  }   
}

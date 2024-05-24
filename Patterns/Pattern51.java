import java.util.Scanner;

public class Pattern51 
{
    static void display(int n)
    {
        int result;
        for(int i=0;i<n;i++)
        {
            result = (int)(1 * Math.pow(11, i));
            System.out.println(result);
        }
    }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    display(n);
    sc.close();
  }  
}

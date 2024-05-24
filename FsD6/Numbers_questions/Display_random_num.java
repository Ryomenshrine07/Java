import java.util.Scanner;

public class Display_random_num 
{
   void display(int n)
    {
        System.out.println(System.identityHashCode(n));
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       Display_random_num obj = new Display_random_num();
       int n = 0;
       obj.display(n);
       sc.close();
    } 
}

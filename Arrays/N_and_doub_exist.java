import java.util.Scanner;

public class N_and_doub_exist 
{
  public static void main(String[] args) 
  {
    boolean ans=false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n =sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Array elements");
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(i!=j&&arr[i]==2*arr[j])
            ans=true;
        }
    }
    System.out.println(ans);
  }  
}

import java.util.Scanner;

public class Maximum_arr 
{
  public static void main(String[] args) 
  {
    int sum=0,l;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n =sc.nextInt();
    int[] nums = new int[n];
    System.out.println("enter elements for array");
    for(int i=0;i<nums.length;i++)
    {
        nums[i] = sc.nextInt();
    }
    l=nums[0];
    for(int i=0;i<nums.length;i++)
    {
        sum=0;
        for(int j=i;j<nums.length;j++)
        {
            sum = sum + nums[j];
            if(sum>l)
            {
                l=sum;
            }
        }
    }
    System.out.println("Sum is :"+l);
    sc.close();
  }  
}

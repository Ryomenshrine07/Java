import java.util.Scanner;

public class conseutive_1 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements in array");
     int n = sc.nextInt();
     int[] nums = new int[n];
     System.out.println("Enter array elements");
     for(int i=0;i<nums.length;i++)
     {
        nums[i] = sc.nextInt();
     }
     int c=0,l=0;
     for(int i=0;i<nums.length;i++)
     {
        c=0;
        if(nums[i]==1)
        {
            c++;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==1)
                c++;
                else
                break;
            }
        }
        if(c>l)
        l=c;
     }
     System.out.println(l);
     sc.close();
   } 
}

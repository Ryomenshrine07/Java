import java.util.Scanner;

public class Selecion_sort 
{
    static void sort(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Sorting, array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter elements for array");
      for(int i=0;i<arr.length;i++)
      {
        arr[i] = sc.nextInt();
      }
      sort(arr);
      sc.close();
   } 
}

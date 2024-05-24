package FsD6.Numbers_questions;

import java.util.Scanner;

public class FindAllDiviionOf3And5
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       int sum1 = 0, sum2 = 0;
//       for(int i=1;i<n;i++)
//       {
//           if(i % 3 == 0) {
//               sum1 = sum1 + i;
//           }
//       }
//       System.out.println(sum1);
//        for(int i=1;i<n;i++)
//        {
//            if(i % 5 == 0) {
//                sum2 = sum2 + i;
//            }
//        }
//        System.out.println(sum2);
        for(int i=1;i<n;i++)
        {
            if(i % 3 ==0 || i % 5 == 0)
            {
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);
    }
}

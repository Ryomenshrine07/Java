package Amount_calc;

import java.util.ArrayList;
import java.util.Scanner;

public class SqrtX
{
    static int findSquareRoot(int x)
    {
        boolean flag = false;
        long i=0;
        long minRoot = 0;
        long maxRoot = 0;
        for(i=1;i<=x;i++)
        {
            if(i * i == x)
            {
                flag = true;
                break;
            }
            else if(i * i < x)
            {
                minRoot = Math.max(minRoot,i);
            }
            else
            {
                maxRoot = i;
                break;
            }
        }
        if(flag)
        {
            return (int) i;
        }
        else
        {
            long[] roots = new long[2];
            roots[0] = minRoot;
            roots[1] = maxRoot;
            for(int j=0;j<roots.length;j++)
            {
                double pro = (double) x / roots[j];
                double avg = (pro + roots[j]) / 2;
                double avgSquare = avg * avg;
                if(Math.round(avgSquare) == x)
                {
                    return (int) avg;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number :");
        int n = sc.nextInt();
        int sqRoot = findSquareRoot(n);
        System.out.println("Square Root is :"+sqRoot);
    }
}

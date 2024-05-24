package Patterns;

import java.util.Scanner;

public class Q44
{
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int p = 1;
            for(int j=i;j<(n/2)+1;j++)
            {
                System.out.print(" ");
            }
            if(i<=(n/2)+1) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j <= i) {
                        System.out.print(p);
                        p++;
                    } else {
                        if (j == i + 1) {
                            p = p - 2;
                        } else {
                            p--;
                        }
                        System.out.print(p);
                    }
                }
            }
            else {
                int p2 = 1;
                for (int j = (n / 2) + 2; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                    if (j <= (n - i + 1)) {
                        System.out.print(p2);
                        p2++;
                    } else {
                        if (j == (n - i + 1) + 1) {
                            p2 = p2 - 2;
                        } else {
                            p2--;
                        }
                        System.out.print(p2);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A  Number");
        int n = sc.nextInt();
        printPattern(n);
    }
}

package Exception_Handling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Priyanka_practice
{
    public static void main(String[] args)
    {
        int a = 10,b = 0;
        int[] arr = new int[10];
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        try
        {
            while (i<=arr.length)
            {
                try
                {
                    arr[i++] = sc.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Enter only integers");
                    sc.next(); // Clear the invalid input from the scanner
                    i--;
                }
            }

        }
        catch (ArithmeticException e)
        {
            System.out.println((double) a/b);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array got out of bounds");
        }

    }
}

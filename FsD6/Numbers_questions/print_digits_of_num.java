package Numbers_questions;

import java.util.Scanner;

public class print_digits_of_num 
{
   void display(int n)
    {
        int count = 0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println("Number of digits are :"+count);

    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       print_digits_of_num obj = new print_digits_of_num();
       obj.display(n);
       sc.close();
    } 
}

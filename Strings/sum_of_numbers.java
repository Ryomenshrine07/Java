import java.util.Scanner;

class sum_of_numbers
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String");
       String str = sc.nextLine();
       int sum=0;
       for(int i=0;i<str.length();i++)
       {
         char ch = str.charAt(i);
         if(ch>=48&&ch<=57)
         {
            char zero_char = '0';
            int digit = ch-zero_char;
            sum = sum + digit;
         }
       }
       System.out.println("Sum of digits in String is :"+sum);
       sc.close(); 
    }
}
//package Priyanka;
import java.util.Scanner;
public class String1 
{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
       // for(int i=0;i<str.length();i++)
        //{
          //  char ch=str.charAt(i);
        //}
       // q1 obj= new q1();
       String str_new2="";
       for(int i=0;i<str.length();i++)
       {
        char ch=str.charAt(i);
        int num=(int)(ch);
        int num1=num+32;
        char ch1=(char)(num1);
        str_new2 =str_new2+ch1;
        }
       System.out.print(str_new2);

    }
}
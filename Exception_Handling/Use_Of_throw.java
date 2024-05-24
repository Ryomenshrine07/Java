package Exception_Handling;

import java.util.Scanner;

public class Use_Of_throw
{
    static void eligible(int age) throws Exception {
        if(age<18)
        {
            throw new Exception("Not eligible");
        }
        else
        {
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();
        try
        {
            eligible(age);
        }
        catch (Exception e)
        {
//            System.out.println("Not eligible");
//            System.out.println("Your age is less than 18");
            System.out.println(e.getMessage());
        }

    }
}

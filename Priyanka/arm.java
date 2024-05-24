package Priyanka;

import java.util.Scanner;

public class arm
{
    static  void arm(int num)
    {
    int digit=count(num);
    int original=num,rem,sum=0;
while(num>0)
{
    rem=num%10;
    sum=sum+(int)Math.pow(rem,digit);
    num=num/10;
}
if(sum==original)
{
System.out.println("number is armstrong");
}
else {
    System.out.println("not a armstrong number");
}
    }
    static  int count(int num) {
        int count = 0;
        while (num > 0) {

            int rem = num % 10;
            count++;
            num = num / 10;
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        arm(num);
        count(num);
    }
}

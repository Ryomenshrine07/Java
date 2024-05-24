package Priyanka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("extra candies");
        int extra= sc.nextInt();
        List<Boolean>li= new ArrayList<>();
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            int sum=0;
            sum=sum+a[i]+extra;
            if(sum>=max)
            {
                li.add(true);
            }
            else
            {
                li.add(false);
            }
        }
        System.out.println(li);
    }

}

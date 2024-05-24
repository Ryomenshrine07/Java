package Priyanka;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int n= sc.nextInt();
        System.out.println("enter array elements");
        int[]a=new int[n];
        for(int i=0;i< a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("enter the times you want to rotate");
int num= sc.nextInt();
num=num%a.length;
while(num>0) {
    int last=a.length-1;
    int next=a.length-2;
    while (next >= 0) {
        int temp = a[next];
                    a[next] = a[last];
                    a[last] = temp;
                    last--;
                    next--;
                }
                num--;
            }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

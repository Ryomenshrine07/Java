package codechef;

import java.util.Scanner;

public class q6 
{
   public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n =sc.nextInt();
		    int d,s=0,count=0,c=n,f=0;
            while(c>0)
            {
                d=c%10;
                count++;
                c=c/10;
            }
            f=count;
		    while(n>0)
		    {
		        d=n%10;
                if(count==1||count==f)
                {
                s=s+d;
                }
                count--;
		        n=n/10;
            }
            System.out.println(s);
		}
        sc.close();
	} 
}

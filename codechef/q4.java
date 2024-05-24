package codechef;

import java.util.Scanner;

public class q4 
{
  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int cp = x-y;
		    double sp = x+(x*0.10);
		    int nsp= (int) Math.round(sp);
            System.out.println(nsp-cp);
	    }
        sc.close();
    }  
}

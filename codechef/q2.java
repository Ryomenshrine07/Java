package codechef;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int l,r,i;
		Scanner sc = new Scanner(System.in);
		l=sc.nextInt();
		r=sc.nextInt();
        sc.close();
		for(i=l;i<=r;i++)
		{
		    if(i%2!=0)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}


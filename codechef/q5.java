 package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Code_thinker
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if((a+b+c)>=100||(a>=10&&b>=10&&c>=10))
		    System.out.println("PASS");
		    else
		    System.out.println("FAIL");
		}
		sc.close();
	}
}

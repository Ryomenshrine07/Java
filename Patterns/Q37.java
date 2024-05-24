package patterns;
import java.util.*;
public class Q37 
{
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i<=(n/2)+1)
			{
				for(int k=1;k<=(n/2+1)-i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int k=(n/2)+2;k<=i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=(n-i)+1;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		pattern(n);
		sc.close();
	}

}

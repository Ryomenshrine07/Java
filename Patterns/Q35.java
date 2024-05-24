package patterns;
import java.util.*;
public class Q35 
{
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i<=n/2)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
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

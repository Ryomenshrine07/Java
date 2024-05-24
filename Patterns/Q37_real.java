package patterns;
import java.util.*;
public class Q37_real 
{
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i<=n/2)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
			}
			else
			{
				for(int j=1;j<=(n-i)+1;j++)
				{
					System.out.print(j);
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

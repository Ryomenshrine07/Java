import java.util.Scanner;
public class q9 
{
    static int[] a;
    static int[] b;
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter two numbers");
    int A =sc.nextInt();
    int B =sc.nextInt();
    a = new int[A];
    b = new int[B];
    int c1=0,c2=0;
    for(int i=1,j=0;i<=A;i++)
    {
        if(A%i==0)
        {
        a[j]=i;
        j++;
        }
        if(A%i==0)
        c1++;
    }
    int[] a2 = new int[c1];
    for(int i=0,j=0;i<a.length;i++)
    {
        if(a[i]>0)
        {
            a2[j]=a[i];
            j++;
        }
    }
    for(int i=1,j=0;i<=B;i++)
    {
        if(B%i==0)
        {
        b[j]=i;
        j++;
        }
        if(B%i==0)
        c2++;
    }
    int[] b2 = new int[c2];
    for(int i=0,j=0;i<b.length;i++)
    {
        if(b[i]>0)
        {
            b2[j]=b[i];
            j++;
        }
    }
    int c3=0;
    int[][] z ={a2,b2};
    for(int i=0;i<z.length;i++)
    {
        for(int j=0;j<z[i].length;j++)
        {
            if(z[i][j]==z[i][j])
            c3++;
        }
    }
    int[] m = new int[c3];
    for(int i=0,k=0;i<z.length;i++)
    {
        for(int j=0;j<z[i].length;j++)
        {
            if(z[i][j]==z[i][j])
            {
            m[k]=z[i][j];
            k++;
            }
        }
    }
    int c4=0;
    for(int i=0;i<m.length;i++)
    {
        for(int j=i+1;j<m.length;j++)
        {
            if(m[i]==m[j])
            {
                c4++;
            }
        }
    }
    int[] h = new int[c4];
    for(int i=0,v=0;i<m.length;i++)
    {
        for(int j=i+1;j<m.length;j++)
        {
            if(m[i]==m[j])
            {
                h[v]=m[j];
                v++;
            }
        }
    }
    int large=0;
    for(int i=0;i<h.length;i++)
    {
        if(h[i]>large)
        large=h[i];
    }
    System.out.println(large);
    sc.close();
 }
}

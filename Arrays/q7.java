import java.util.*;
class q7
{
    public static void main(String[] args) 
    {
       Scanner sc =new Scanner(System.in);
       int t=sc.nextInt(); 
       for(int i=0;i<t;i++)
       {
       int n=sc.nextInt();
       int c=n,count=0,rev=0;
       double n2=n;
       while(c!=0)
       {
        count++;
        rev=rev*10+c%10;
        c=c/10;
       }
       int[] a = new int[count];
       for(int j=0;j<count;j++)
       {
          int r=rev%10;
          a[j]=r;
          rev=rev/10;
       }
       for(int j=0;j<count;j++)
       {
          if(a[j]==0)
          {
            n2=n2+5*Math.pow(10, (count-1)-j);
          }  
       }
       n=(int)n2;
       System.out.println(n);
       System.out.println();
    }
    sc.close();
    }
}
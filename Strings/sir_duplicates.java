import java.util.Scanner;

public class sir_duplicates 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String s = sc.nextLine();
    String str = "";
    for(int i=0;i<s.length();i++)
    {
        int temp=0;
        for(int j=i+1;j<s.length();j++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                temp++;
            }
        }
        if(temp==0)
        {
            str = str + s.charAt(i);
        }
    }
    System.out.println("After Removing duplicates :"+str);
    sc.close();
  }  
}

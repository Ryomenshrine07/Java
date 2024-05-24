import java.util.Scanner;

public class Anagram_or_not 
{
  public static void main(String[] args)
  {
    boolean flag=true;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two Strings to be checked");
    String a = sc.nextLine();
    String b = sc.nextLine();
    a = a.toLowerCase();
    b = b.toLowerCase();
    for(int i=0;i<a.length();i++)
    {
        char ch = a.charAt(i);
        int count=0,count2=0;
        for(int j=0;j<a.length();j++)
        {
            if(a.charAt(j)==ch)
            count++;
            else
            continue;
        }
        for(int j=0;j<a.length();j++)
        {
            if(b.charAt(j)==ch)
            count2++;
            else
            continue;
        }
        if(count!=count2)
        {
            flag=false;
            break;
        }
    }
    if(flag!=true || (a.length()!=b.length()))
    System.out.println("They are not anagrams");
    else
    System.out.println("They are anagrams");
    sc.close();
  }  
}

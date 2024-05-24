import java.util.Scanner;

public class String_tokens 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your String");
    String str = sc.nextLine();
    str = str.trim(); //Removing spaces from the beginning and the end of the String.
    if(str.length()==0)
    {
        System.out.println(0);
    }
    else
    {
        String[] string = str.split("[ !,?._'@]+");/*this expression matches any character that "[a-zA-Z0-9]+"
        is not an alphabet letter (lowercase or uppercase) or a digit. + means one or more occurences*/
        for(int i=0;i<string.length;i++)
        {
           System.out.println(string[i]);
        }
    }
  }  
}

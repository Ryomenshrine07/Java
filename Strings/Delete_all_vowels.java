import java.util.Scanner;

public class Delete_all_vowels 
{
  public static void main(String[] args) 
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a Sentence");
    String str = sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
        str = str.replace(str.charAt(i),' ');
    }
    System.out.println(str);
    sc.close();
  }  
}

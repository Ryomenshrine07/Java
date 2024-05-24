import java.util.Scanner;
public class count_vowel_succession 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    int i,j;
    for(i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
        {
          for(j=i+1;j<str.length();)
          {
            if(str.charAt(j)=='a'||str.charAt(j)=='A'||str.charAt(j)=='e'||str.charAt(j)=='E'||str.charAt(j)=='i'||str.charAt(j)=='I'||str.charAt(j)=='o'||str.charAt(j)=='O'||str.charAt(j)=='u'||str.charAt(j)=='U')
            {
              System.out.print(str.charAt(i)+""+str.charAt(j)+" ");
              break;
            }
            break;
          }
        }
    }
  }  
}

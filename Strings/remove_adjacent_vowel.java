import java.util.Scanner;

class remove_adjacent_vowel
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    String str2 = "";
    int i,l=0,count=0;
    sc.close();
    for(i=0;i<str.length();i++)
    {
        if(i==l&&count>0)
        continue;
        char ch = str.charAt(i);
      if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            if(i==str.length()-1)
            {
                str2 = str2 + ch;
                break;
            }
            else if(i<str.length()-1)
            {
              if(str.charAt(i+1)=='a'||str.charAt(i+1)=='A'||str.charAt(i+1)=='e'||str.charAt(i+1)=='E'||str.charAt(i+1)=='i'||str.charAt(i+1)=='I'||str.charAt(i+1)=='o'||str.charAt(i+1)=='O'||str.charAt(i+1)=='u'||str.charAt(i+1)=='U')
              {
                count++;
                str2 = str2 + ch;
                l=i+1;
              }
              else
              {
                str2 = str2 + ch;
              }
            }     
        }
        else
        {
            str2 = str2 + ch;
        }
    }
    System.out.println("Result is : "+str2); 
    }
}
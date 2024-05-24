import java.util.Scanner;

public class count_everry_char 
{
  public static void main(String[] args) 
  {
    int flag=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    char arr[] = new char[str.length()]; 
    for(int i=0,k=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        int count=0;
        for(int j=0;j<str.length();j++)
        {
            if(ch==str.charAt(j))
            count++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(ch!=arr[i])
            flag=1;
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            arr[k]=ch;
            k++;
            System.out.println(ch+" is present "+count+" times");
        }

    }
    sc.close();
  }  
}

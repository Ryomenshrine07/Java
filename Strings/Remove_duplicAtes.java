import java.util.Scanner;
public class Remove_duplicAtes 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String Str = sc.nextLine();
    char[] ch = Str.toCharArray();
    System.out.println("Your String is :"+Str);
    char[] new_ch = new char[ch.length];
    int flag=0;
    for(int i=0,k=0;i<ch.length;i++)
    {
        for(int j=0;j<ch.length;j++)
        {
            if(ch[i]!=new_ch[j])
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            new_ch[k]=ch[i];
            k++;
        }
    }
    String new_str="";
    for(int i=0;i<ch.length;i++)
    {
        if((new_ch[i]>=65&&new_ch[i]<=90)||(new_ch[i]>=97&&new_ch[i]<=122))
        new_str = new_str + new_ch[i];
    }
    System.out.println("length of new String is :"+new_str.length());
    System.out.println("NEW String is :"+new_str);  
    sc.close();
  }  
}

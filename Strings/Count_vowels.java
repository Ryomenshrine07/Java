import java.util.Scanner;
public class Count_vowels 
{
   public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String Str = sc.nextLine();
		int count=0;
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
    for(int i=0;i<new_str.length();i++)
    {
        char ch1 = new_str.charAt(i);
        if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
		{
			count++;
		}
    }
    System.out.println("No. of vowels in a String are :"+count);
    sc.close();
	} 
}

package Strings;

public class Reverse_String
{
  public static void main(String[] args) 
  {
    String[] str = {"To err is human...","But to really mess things up...","One needs to know Java!!"};
    int end = str.length-1;
    for(int i=0;end>i;i++,end--)
    {
        String t = str[i];
        str[i] = str[end];
        str[end] = t;
    }
    for(int i=0;i<str.length;i++)
    {
        System.out.println(str[i]);
    }
  }  
}

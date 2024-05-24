package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_of_sentence 
{
   static void reverse_sentence(String str)
   {
    ArrayList<String> list = new ArrayList<>();
    for(int i=0;i<str.length();i++)
    {
      String word = "";
      while(i<str.length() && str.charAt(i)!=' ')
      {
        word = word + str.charAt(i);
        i++;
      }
      list.add(word);
    }
    // Collections.reverse(list);
    String new_str="";
    for(int i=list.size()-1;i>=0;i--)
    {
      new_str = new_str + list.get(i);
    }
    System.out.println("Reversed sentence is :"+new_str);
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    reverse_sentence(str);
    sc.close();
  }  
}

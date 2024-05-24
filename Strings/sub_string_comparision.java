import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sub_string_comparision 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your String");
    String s = sc.nextLine();
    System.out.println("Enter size of substring");
    int k = sc.nextInt();
    k=k+1;
    ArrayList<String> al = new ArrayList<>();
    for(int i=0;i<s.length()-k+2;i++)
    {
      String sub =s.substring(i, (i+k)-1);
      al.add(sub);
    }
    System.out.println("Substrings are :"+al);
    Collections.sort(al);
    System.out.println("Substrings in sorted order or lexographical order :");
    System.out.println(al);
    // System.out.println(al.get(0));
    // System.out.println(al.get(al.size()-1));
    Collections.sort(al,Collections.reverseOrder());
    System.out.println("Substrings in reverse oerder :");
    System.out.println(al);
    sc.close();
  }  
}

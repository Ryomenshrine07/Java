import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largest_and_smallest_sub_string 
{
  public static void main(String[] args) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your String");
    String s = sc.nextLine();
    System.out.println("Enter size of substring");
    int k = sc.nextInt();
    k=k+1;
    ArrayList<String> al = new ArrayList<>();
    for(int i=0;i<al.size()-k+2;i++)
    {
      String sub = s.substring(i,(i+k)-1);
      al.add(sub);
    }
    System.out.println("Substrings are :"+al);
    Collections.sort(al);
    System.out.println("Substrings in lexographical order :");
    System.out.println(al);
    System.out.println("Smallest substring is :"+al.get(0));
    System.out.println("Largest substring is :"+al.get(al.size()-1));
    sc.close();
  }  
}

import java.util.Scanner;

public class delete_all_the 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Sentence");
    String str = sc.nextLine();
    str  = str.replace("the", "");
    System.out.println(str);
    sc.close();
  } 
}

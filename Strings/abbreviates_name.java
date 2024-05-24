import java.util.Scanner;

public class abbreviates_name 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. names for list :");
    int n =sc.nextInt();
    System.out.println("Enter names in the list :");
    String[] str = new String[n];
    for(int i=0;i<str.length;i++)
    {
        str[i] = sc.nextLine();
    }
    for(int i=0;i<str.length-1;i++)
    {
        String replace = Character.toString(str[i].charAt(i)); 
        str[i] = str[i].replace(str[i], replace);
    }
    System.out.println("After Abberiviation :");
    for(int i=0;i<str.length;i++)
    {
        System.out.println(str[i]);
    }
    sc.close();
  }  
}

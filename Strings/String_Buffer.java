import java.util.Scanner;

public class String_Buffer 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    System.err.println(sb.capacity());
    sb.append("HEll yeah!! hohohohohohohohohho");
    System.out.println(sb.capacity());
  }  
}

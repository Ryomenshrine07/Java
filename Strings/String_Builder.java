package Strings;

//package Strings;
public class String_Builder 
{
  public static void main(String[] args) 
  {
    StringBuilder s1 = new StringBuilder("Jhansi");
    s1.append(" Fort");
    System.out.println(s1);
    s1.replace(6, 11, " Food");
    System.out.println(s1);
    s1.delete(s1.length()-1   , s1.length());
    System.out.println("After deletion : "+s1);
    s1.insert(6, " Food Court");
    System.out.println(s1);
  }  
}

//package Strings;

public class Common_fun_of_str 
{
  public static void main(String[] args) 
  {
    String s1 = "jhansi";
    String s2 = "Fort";
    System.out.println(s1+s2);
    String s3 = s1.concat(s2);
    System.out.println(s3);
    s3 = s3.replace("j", "J");
    System.out.println(s3);
    s3 = String.copyValueOf(s2.toCharArray());
    System.out.println(s3);
    int c =s2.compareTo(s1);
    if(c<0)
    {
        System.out.println("s2 is less than s1");
    }
    else if(c==0)
    {
        System.out.println("s2 is eual to s1");
    }
    else
    {
        System.out.println("s2 i greater than s1");
    }
    s3 = s1.toUpperCase()+" "+s2.toUpperCase();
    System.out.println(s3);
    s3 = s2.replace(s2.charAt(3), ' ');
    System.out.println(s3);
    int fir = s1.indexOf("n");
    System.out.println(fir);
    int last = s2.lastIndexOf("r");
    System.out.println(last);
    s3 = s1.substring(fir);
    System.out.println(s3);     
  }  
}

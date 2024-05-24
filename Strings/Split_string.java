//package Strings;
import java.io.File;
public class Split_string 
{
  public static void main(String[] args) throws Exception
  {
    File f = new File("Recycle Bin");
    String d = f.getCanonicalPath();
    String[] parts = d.split("\\\\");
    System.out.println("Complete path is : "+d);
    System.out.println("Dir is: "+parts[parts.length-1]);    
  }  
}


import java.util.Scanner; 
import java.util.ArrayList; 
 
public class rever_sent { 
  
 static void word(String str) 
 { 
  ArrayList<String> al = new ArrayList<String>(); 
  int i = 0; 
  String word = ""; 
  while (i<=str.length()) 
  { 
   while (i<str.length() && str.charAt(i)!=' ') 
   { 
    word = word+str.charAt(i); 
    i++; 
   } 
   al.add(word); 
   word = ""; 
   i++; 
  } 
  for (int j=al.size()-1;j>=0;j--) 
  { 
   System.out.print(al.get(j)+" "); 
  } 
 } 
 public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter the string"); 
  String str = sc.nextLine(); 
  word(str); 
  sc.close(); 
 } 
 
}
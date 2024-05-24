package Exception_Handling;//package Exception_Handling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Case1_exp 
{
  public static void main(String[] args) throws IOException
  {
    try
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Entered Value is :"+num);
    }
    catch(IOException e)
    {
        System.out.println("Error in input");
    }
    // catch(NumberFormatException e)
    // {
    //     System.out.println("Enter valid format");
    // }
  }  
}

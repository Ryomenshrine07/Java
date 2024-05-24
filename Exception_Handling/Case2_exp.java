package Exception_Handling;//package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case2_exp 
{
  public static void main(String[] args) 
  {
    while(true)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter a number");
            int num = Integer.parseInt(br.readLine());
            break;
        }
        catch(IOException e)
        {
            System.out.println("Error in input");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter a valid integer");
        } 
    }
  }  
}

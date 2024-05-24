import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class charList_to_array 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of character array");
       int n =sc.nextInt();
       char ch[] = new char[n];
       System.out.println("Enter Charaters");
       for(int i=0;i<ch.length;i++)
       {
        ch[i] = sc.next().charAt(0);
       }
       ArrayList<Character> c = new ArrayList<>();
       for(char i: ch)//adding elements to list
       {
        c.add(i);
       }
       System.out.println("your character list is :"+c);
       Character ch2[] = c.toArray(new Character[0]);           
       
    }
}

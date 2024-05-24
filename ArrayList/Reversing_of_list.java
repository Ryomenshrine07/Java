package ArrayList;//package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Reversing_of_list
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of your list");
      int n = sc.nextInt();
      ArrayList<Integer> ar = new ArrayList<>(n);
      System.out.println("Enter your elements");
      for(int i=0;i<n;i++)
      {
        int num = sc.nextInt();
        ar.add(i, num);
      }
      System.out.println("Your current list :"+ar);
      //Collections.sort(ar,Collections.reverseOrder());
      Collections.reverse(ar);
      System.out.println("After reversal of list :"+ar);
      sc.close();
    }
}
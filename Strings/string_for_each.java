import java.util.Scanner;

public class string_for_each {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l=0;

        String str=sc.nextLine();
        
        for(char i: str.toCharArray())
        {
        l++;
        }
       System.out.println(l);
    }
}

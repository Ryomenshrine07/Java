package BitManipulation;

public class BitWiseOperators
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 2;
        System.out.println((a&b));

        System.out.println("a | b :"+(a|b));

        System.out.println("~a :"+~a);
        int c = 43261596;
        int f = 0b1001111100;
        int g = f;
        StringBuilder d = new StringBuilder(Integer.toBinaryString(43261596));
        System.out.println("Binary String is :"+"000000"+d);
        int sp = 0;
        int end = d.length() - 1;
        while(sp < end && sp != end)
        {
            char temp = d.charAt(sp);
            d.setCharAt(sp,d.charAt(end));
            d.setCharAt(end,temp);
            sp++;
            end--;
        }
        System.out.println("Reverse Binary String is :"+d);
        System.out.println("Reverse Binary String number is :"+Integer.parseInt(String.valueOf(d+"000000"),2));
        System.out.println(9&3);
    }
}

package Output_Chcek;

public class Check_1
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try
        {
//            int[] arr = new int[10];
//            System.out.println(arr[23]);

            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println((float)a/b);
        }

    }
}

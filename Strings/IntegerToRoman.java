package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class IntegerToRoman
{
    static String getRoman(int n)
    {
        return switch (n) {
            case 1 -> "I";
            case 5 -> "V";
            case 10 -> "X";
            case 50 -> "L";
            case 100 -> "C";
            case 500 -> "D";
            case 1000 -> "M";
            default -> "-1";
        };
    }
    static String generateRomanNumber(int num) {
        String romanNumber = "";
        int k = 0;
        int c = num;
        while (c != 0) {
            k++;
            c = c / 10;
        }
        k = k - 1;
        String number = Integer.toString(num);
        int i = 0;
        int n = 0;
        while (i < number.length())
        {
            n = (number.charAt(i) - '0');
            if(n == 0)
            {
                if(k>0) {
                    k--;
                }
                i++;
                continue;
            }
            String result = getRoman(n * (int) Math.pow(10,k));
            if(result.equals("-1"))
            {
                n = n * (int) Math.pow(10,k);
                if(k == 0)
                {
                    if(n >=1 && n <= 3)
                    {
                        String str = "";
                        while(n != 0)
                        {
                            n = n - 1;
                            str = str + 'I';
                        }
                        romanNumber = romanNumber + str;
                        i++;
                        k--;
                    }
                    else if(n > 5 && n < 9)
                    {
                        String str = "";
                        n = n - 5;
                        while(n != 0)
                        {
                            n = n - 1;
                            str = str + 'I';
                        }
                        romanNumber = romanNumber + getRoman(5) + str;
                        i++;
                        k--;
                    }
                    else if (n == 4)
                    {
                        String str = "I";
                        romanNumber = romanNumber + str + getRoman(n+(int)Math.pow(10,k));
                        i++;
                        k--;
                    }
                    else if (n == 9)
                    {
                        String str = "I";
                        romanNumber = romanNumber + str + getRoman(n+(int)Math.pow(10,k));
                        i++;
                        k--;
                    }
                }
                else if(k == 1)
                {
                    if(n >=10 && n <= 30)
                    {
                        String str = "";
                        while(n != 0)
                        {
                            n = n - 10;
                            str = str + 'X';
                        }
                        romanNumber = romanNumber + str;
                        i++;
                        k--;
                    }
                    else if(n > 50 && n < 90)
                    {
                        String str = "";
                        n = n - 50;
                        while(n != 0)
                        {
                            n = n - 10;
                            str = str + 'X';
                        }
                        romanNumber = romanNumber + getRoman(50) + str;
                        i++;
                        k--;
                    }
                    else if (n == 40)
                    {
                        String str = "X";
                        romanNumber = romanNumber + str + getRoman(n+(int)Math.pow(10,k));
                        i++;
                        k--;
                    }
                    else if (n == 90)
                    {
                        String str = "X";
                        romanNumber = romanNumber + str + getRoman(n+(int)Math.pow(10,k));
                        i++;
                        k--;
                    }

                }
                else if(k == 2)
                {
                    if(n >=100 && n <= 300)
                    {
                        String str = "";
                        while(n != 0)
                        {
                            n = n - 100;
                            str = str + 'C';
                        }
                        romanNumber = romanNumber + str;
                        i++;
                        k--;
                    }
                    else if(n > 500 && n < 900)
                    {
                        String str = "";
                        n = n - 500;
                        while(n != 0)
                        {
                            n = n - 100;
                            str = str + 'C';
                        }
                        romanNumber = romanNumber + getRoman(500) + str;
                        i++;
                        k--;

                    }
                    else if (n == 400)
                    {
                        String str = "C";
                        romanNumber = romanNumber + str + getRoman(n+(int)Math.pow(10,k));
                        i++;
                        k--;
                    }
                    else if (n == 900)
                    {
                        String str = "C";
                        romanNumber = romanNumber + str + getRoman(n+(int)Math.pow(10,k));
                        i++;
                        k--;
                    }

                }
                else if(k == 3)
                {
                    if(n >=1000 && n <= 3000)
                    {
                        String str = "";
                        while(n != 0)
                        {
                            n = n - 1000;
                            str = str + 'M';
                        }
                        romanNumber = romanNumber + str;
                        i++;
                        k--;
                    }
                    else if (n == 4000)
                    {
                        String str = "MMMM";
                        romanNumber = romanNumber + str;
                        i++;
                        k--;
                    }
                }
            }
            else
            {
                romanNumber = romanNumber + result;
                i++;
                k--;
            }
        }
        return romanNumber;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        String romanNumber = generateRomanNumber(n);
        System.out.println("Respective Roman Number is :"+romanNumber);
    }
}

package Hacker_code;
import java.util.*;

class calender
{
    public static String find_day(int month,int day,int year)
    {
        Calendar cal = Calendar.getInstance();
        cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR,year);
        String s= cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return s;
    }
}
public class q6 
{
    public static void main(String[] args) 
    {
        String s;
        s= calender.find_day(8, 14, 2017);
        System.out.println(s);
    }
}

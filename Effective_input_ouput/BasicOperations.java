package Effective_input_ouput;

import java.io.*;
import java.util.Date;

public class BasicOperations
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try
        {
            System.out.println("Enter File Name");
            str = br.readLine();
            File file;
            file = new File(str);
            FileWriter f = new FileWriter(str);
            if(file.exists())
            {
                System.out.println("Name Of The File is :" + file.getName());
                System.out.println("File's Directory is :" + file.getParent());
                int dot = str.lastIndexOf('.');
                String ext = str.substring(dot);
                System.out.println("Extension Of The File is :" + ext);
                System.out.println("File's Absolute Path is :" + file.getAbsolutePath());
                System.out.println("Last Accessed Date :" + new Date(file.lastModified()));
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

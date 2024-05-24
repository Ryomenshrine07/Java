package Effective_input_ouput;

import java.io.File;

public class DriveSpace
{
    public static void main(String[] args)
    {
        for(File d : File.listRoots())
        {
            System.out.println("Drive is :"+d);
            System.out.println("Total Space :"+d.getTotalSpace());
            System.out.println("Free Space :"+d.getFreeSpace());
            System.out.println(" ");
        }
    }
}

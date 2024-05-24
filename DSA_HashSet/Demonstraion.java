package DSA_HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demonstraion
{
    public static void main(String[] args)
    {

        int[] arr = {9,3,2,7,1,100,23,6};
        // Creating an empty HashSet
        HashSet<Integer> hs = new HashSet<Integer>();
        TreeSet<Integer> tSet = new TreeSet<>();

        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]); // [Order Will Not Be Maintained]
            tSet.add(arr[i]);
        }

        // Adding duplicate elements

        // Displaying the HashSet
//        Iterator<Integer> it = hs.iterator();
//        System.out.println(it.next());
        System.out.println(hs);
        System.out.println(tSet);

        // Removing items from HashSet
        // using remove() method
//        System.out.println("List after removing Australia:"+h);

        // Display message
//        System.out.println("Iterating over list:");

        // Iterating over hashSet items
//        Iterator<String> i = h.iterator();

        // Holds true till there is single element remaining
//        while (i.hasNext())
//
//            // Iterating over elements
//            // using next() method
//            System.out.println(i.next());
    }
}

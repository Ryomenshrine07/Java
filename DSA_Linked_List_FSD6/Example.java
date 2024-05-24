package DSA_Linked_List_FSD6;

import java.util.Iterator;
import java.util.LinkedList;

public class Example
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(0);
        linkedList.sort(null);
        System.out.println(linkedList);
        for (Integer integer : linkedList) System.out.println(integer);
    }
}

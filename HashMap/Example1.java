package HashMap;

import java.util.*;

public class Example1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
//        map.put(1,101);
//        map.put(2,203);
//        map.put(3,903);
//        map.put(4,66);
//        map.put(1,333); // Will Overwrite the value;
//        System.out.println(map);
//        System.out.println("enter size of map");
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//           System.out.print("Enter Key :");
//           int key = sc.nextInt();
//           sc.nextLine();
//           System.out.print("Enter Value :");
//           String str = sc.nextLine();
//           map.put(key, str);
//        }
//        System.out.println(map);
//        if( /*map.containsKey(3) ||*/ map.containsValue("nope") /* Checks weather the value is present or not */)
//        {
//            System.out.println("yes");
//        }
//        else {
//            System.out.println(map.getOrDefault(2, "Value Not found"));
//            // If value at given key is present then it returns the value else it runs the
//            // Default value part.
//        }
//        map.putIfAbsent(3,"Sukuna");
//        System.out.println(map);
//        System.out.println(map.keySet());
//        System.out.println(map.entrySet());
//        System.out.println(map.getOrDefault(3,"Nothing"));
//
        int[] arr = {1,1,1,1,1,1,1,1,1,1,2,2,3,1,4,5,5,5,5,9,10,10,2};
        for(int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int maxFrequency = 0;
        int maxElement = 0;
        for(int i : map.keySet())
        {
            int value = map.get(i);
            if(value > maxFrequency)
            {
                maxFrequency = value;
                maxElement = i;
            }
        }
        System.out.println("Max Frequency Element Element is :"+maxElement);
    }
}

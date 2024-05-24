package TreeMap;

import javax.swing.plaf.synth.SynthGraphicsUtils;
import java.util.TreeMap;

// [TreeMap Keeps the order of Keys in Increasing order]
public class Example1
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
        tmap.put(1,"C");
        tmap.put(4,"C++");
        tmap.put(3,"Java");
        tmap.put(2,"Java");

        System.out.println(tmap);
        if(tmap.containsValue("Java"))
        {
            System.out.println("Java is Present");
        }
        if(!tmap.containsKey(5)) {
            System.out.println(tmap.getOrDefault(5, "Python Not Present"));
            tmap.putIfAbsent(5,"Python");
        }
        System.out.println("Keys in Descending order are: "+tmap.descendingKeySet());
        System.out.println("Keys in Ascending order are: "+tmap.keySet());
        System.out.println(tmap.entrySet());

//        TreeMap<Integer,Float> tmap2 = new TreeMap<Integer,Float>();
//        tmap2.put(1,1.4f);
//        tmap2.put(2,5.5f);
//        tmap2.put(3,7.2f);
//        tmap2.put(4,2.4f);
//        System.out.println(tmap2.ceilingEntry(2));




    }
}

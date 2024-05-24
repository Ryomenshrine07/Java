package DSA_HashSet;


import java.util.LinkedHashSet;
import java.util.Random;

class RandomizedSet
{
    LinkedHashSet<Integer> Hset;
    public RandomizedSet()
    {
        this.Hset = new LinkedHashSet<>();
    }
    public boolean insert(int val)
    {
        if(!Hset.contains(val))
        {
            Hset.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val)
    {
        if(Hset.contains(val))
        {
            Hset.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom()
    {
        Integer[] array = Hset.toArray(new Integer[0]);
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
}

public class InsertDeleteGetRandom
{
    public static void main(String[] args)
    {
        RandomizedSet obj = new RandomizedSet();
        while(true)
        {
            int param_3 = obj.getRandom();
            boolean param_1 = obj.insert(1);
            boolean param_2 = obj.remove(2);
            System.out.println(param_3+" "+param_1+" "+param_2);
            break;
        }
    }
}

public class first_to_occur_k
{
    public static int firstElementKTimes(int[] arr, int k)
    {
        int n = arr.length;
        // Iterate through the array
        for (int i=0;i<n;i++)
        {
            int count=1; // Initialize count for current element
            // Check if the current element is the first element occurring at least K times
            if (arr[i]!=Integer.MIN_VALUE) 
            {
                for (int j=i+1;j<n;j++) 
                {
                    if (arr[j]==arr[i]) 
                    {
                        count++;
                        // If count reaches K, return the element
                        if(count==k)
                        {
                            return arr[i];
                        }
                        // Mark the element as visited to avoid re-counting
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
            }
        }
        // If no such element is found, return -1 or handle as needed
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] array = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        int result = firstElementKTimes(array, k);
        if(result != -1) 
        {
            System.out.println("First element occurring at least " + k + " times: " + result);
        } 
        else 
        {
            System.out.println("No element occurs at least " + k + " times.");
        }
    }
}

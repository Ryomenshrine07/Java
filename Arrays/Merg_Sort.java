package Arrays;

public class Merg_Sort
{

    public static void main(String[] args) 
    {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Merge Sort function
    static void mergeSort(int[] array, int left, int right) 
    {
        if (left < right) 
        {
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Merge function to merge two halves of an array
    static void merge(int[] array, int left, int middle, int right) 
    {
        // Calculate the sizes of the two subarrays to be merged
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        // Create temporary arrays to hold the two halves
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temporary arrays
        for (int i = 0; i < sizeLeft; ++i) 
        {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < sizeRight; ++j) 
        {
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < sizeLeft && j < sizeRight) 
        {
            if (leftArray[i] <= rightArray[j]) 
            {
                array[k] = leftArray[i];
                i++;
            } 
            else 
            {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if any
        while (i < sizeLeft) 
        {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if any
        while (j < sizeRight) 
        {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print an array
    static void printArray(int[] array) 
    {
        for (int value : array) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

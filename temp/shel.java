public class shel {

    // Function to perform Shell Sort on the array
    void shellSort(int arr[]) {
        int n = arr.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements arr[0..gap-1] are already in gapped order
            // Keep adding one more element until the entire array is sorted
            for (int i = gap; i < n; i++) {
                // Add arr[i] to the elements that have been gap sorted
                // Save arr[i] in temp and make a hole at position i
                int temp = arr[i];

                // Shift earlier gap-sorted elements up until the correct
                // location for arr[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Put temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }
    }

    // Utility method to print an array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method to test the above
    public static void main(String args[]) {
        int arr[] = {11, 88, 22, 77, 33,66,44,55};

        System.out.println("Array before sorting:");
        shel ob = new shel();
        ob.printArray(arr);

        // Perform shell sort
        ob.shellSort(arr);

        System.out.println("Array after sorting:");
        ob.printArray(arr);
    }
}

package Stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUpdateExample {

    public static void main(String[] args) {
        // Create a sample queue
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Index of the element to update
        int indexToUpdate = 2;
        // New value to update
        int newValue = 35;

        // Update element at the specified index
        updateElementAtIndex(queue, indexToUpdate, newValue);

        // Print the updated queue
        System.out.println("Updated Queue: " + queue);
    }

    static void updateElementAtIndex(Queue<Integer> queue, int index, int newValue) {
        if (index < 0 || index >= queue.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Remove elements until the desired index
        for (int i = 0; i < index; i++)
        {
            queue.add(queue.poll());
        }

        // Update the element at the desired index
        queue.poll(); // Remove the element at the index
        queue.add(newValue); // Add the new value

        // Restore the queue to its original state
        for (int i = 0; i < queue.size() - 1 - index; i++) {
            queue.add(queue.poll());
        }
    }
}

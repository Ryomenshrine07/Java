package Queue;

import java.util.*;

public class RevealCardsInIncreasingOrder
{
    static void enterElements(int[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static int[] shuffleTheDeck(int[] deck)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        Queue<Integer> hah = new ArrayDeque<>();
        Arrays.sort(deck);
        deque.addLast(deck[deck.length-1]);
        for(int i = deck.length-2;i>=0;i--)
        {
            deque.addFirst(deque.getLast());
            deque.pollLast();
            deque.addFirst(deck[i]);
        }
        for(int i=0;i<deck.length;i++)
        {
            deck[i] = deque.pollFirst();
        }
        return deck;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterElements(arr);
        int[] shuffleOrder = shuffleTheDeck(arr);
        for(int i : shuffleOrder)
        {
            System.out.print(i+" ");
        }
    }
}

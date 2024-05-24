package DSA_Linked_List_FSD6;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode reverseBetween(ListNode head, int left, int right)
//    {
//        if(head == null || head.next == null || left == right)
//        {
//            return head;
//        }
//        ListNode previous = null;
//        ListNode start = null;
//        ListNode curr = head;
//        ListNode prev = null;
//        ListNode next = null;
//        int pos = 1;
//        int count = 0;
//        while(curr != null)
//        {
//            if(pos >= left && pos <= right)
//            {
//                if(count == 0)
//                {
//                    start = curr;
//                    count++;
//                }
//                next = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = next;
//            }
//            else
//            {
//                if(pos < left)
//                {
//                    previous = curr;
//                }
//                if(pos > right)
//                {
//                    break;
//                }
//                curr = curr.next;
//            }
//            pos++;
//        }
//        if(previous == null)
//        {
//            head = prev;
//            start.next = curr;
//            return head;
//        }
//        previous.next = prev;
//        start.next = next;
//        return head;
//    }
//}

public class ReverseLinkedList2
{

}

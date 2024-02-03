/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        
        while(tortoise!=null && hare!=null && hare.next!=null) {
            tortoise=tortoise.next;
            hare=hare.next.next;
            
            while(hare==tortoise) {
                hare=head;
                while(hare!=tortoise) {
                    tortoise=tortoise.next;
                    hare=hare.next;
                }
                return hare;
            }
        }
        return null;
    }
}
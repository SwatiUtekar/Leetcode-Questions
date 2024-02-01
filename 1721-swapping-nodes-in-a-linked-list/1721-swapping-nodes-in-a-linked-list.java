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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        
        //         beginning value
        ListNode beg = dummy;
        int newK = k;
        while(newK!=0) {
            beg = beg.next;
            newK--;
        }
                
//         ending
        ListNode slow = dummy;
        ListNode fast = dummy;
        int tempN = k;
        while(tempN!=0) {
            fast = fast.next;
            tempN--;
        }
        
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        
//         swapping
        int temp=slow.next.val;
        slow.next.val=beg.val;
        beg.val=temp;
        
        return dummy.next;
    }
}
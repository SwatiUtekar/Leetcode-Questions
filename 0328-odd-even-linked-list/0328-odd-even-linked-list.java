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
    public ListNode oddEvenList(ListNode head) {
        // ListNode dummy = new ListNode(0);
        // dummy.next=head;
        ListNode temp=head;
        
        ListNode odd=new ListNode(0);
        ListNode firstOdd=odd;
        
        ListNode even=new ListNode(0);
        ListNode firstEven=even;
        
        int c=1;
        while(temp!=null) {
            if(c%2!=0) {
                odd.next=new ListNode(temp.val);
                odd=odd.next;
                temp=temp.next;
            }else {
                even.next=new ListNode(temp.val);
                even=even.next;
                temp=temp.next;
            }
            c++;
        }
        
        odd.next=firstEven.next;
        
        return firstOdd.next;
    }
}
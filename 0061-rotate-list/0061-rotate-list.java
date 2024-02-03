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
    public ListNode rotateRight(ListNode head, int k) {
//         Size of LinkedList
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode temp1 = dummy;
        int count=0;
        
        while(temp1.next!=null) {
            count++;
            temp1=temp1.next;
        }
        
//      Check whether count or k is zero if yes then return head
        if(count==0 || k==0) {
            return dummy.next;
        }
        
//         Check whether k is greater than size and update rotation number accordingly
        int time=0;
        if(k>=count) {
            time = count - (k%count);
        }else {
            time = count - k;
        }
        
//         Make Rotation
        ListNode temp2 = dummy.next;
        ListNode temp = new ListNode(0);
        while(time>0) {
            temp2 = dummy.next;
            while(temp2.next!=null) {
                temp.val=temp2.val;
                temp2.val=temp2.next.val;
                temp2.next.val=temp.val;
                temp2=temp2.next;
            }
            time--;
        }
        
        return dummy.next;
    }
}
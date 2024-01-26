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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count=1;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        
        ListNode temp2 = head;
        int mid;
        if(count%2==0) {
            mid=count/2 - 1;
            while(mid!=0) {
                temp2=temp2.next;
                mid--;
            }
        }else {
            mid=(count+1)/2 - 1;
            while(mid!=0) {
                temp2=temp2.next;
                mid--;
            }
        }
        return temp2;
    }
}
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
    public int getDecimalValue(ListNode head) {
        ListNode temp1 = head;
        int count=-1;
        while(temp1!=null) {
            temp1=temp1.next;
            count++;
        }
        
        int ans=0;
        ListNode temp2 = head;
        while(temp2!=null){
            ans+=temp2.val*Math.pow(2,count);
            temp2=temp2.next;
            count--;
        }
        return ans;
    }
}
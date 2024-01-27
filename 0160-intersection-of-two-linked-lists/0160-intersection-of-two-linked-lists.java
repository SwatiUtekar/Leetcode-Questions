/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Calculating length of 1st linkedlist 
        ListNode temp = headA;
        int count=0;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        
        ListNode tempA = headA;
        while(count!=0) {
            ListNode tempB = headB;
            while(tempB!=null) {
                if(tempA==tempB && tempA.next==tempB.next) {
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
            count--;
        }
        
        return null;
    }
}
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
    public boolean isPalindrome(ListNode head) {
//         count size of linked list
        ListNode temp1 = head;
        int count=0;
        while(temp1!=null) {
            temp1=temp1.next;
            count++;
        }
        int countCheck=count;
        
//         put element in arraylist
        ListNode temp2 = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(count!=0) {
            list.add(temp2.val);
            temp2=temp2.next;
            count--;
        }
        
//         check palindrome
        for(int i=0 ; i<countCheck ; i++){
            if(list.get(i)!=list.get(countCheck-1-i)) {
                return false;
            }
        }
        
        return true;
    }
}
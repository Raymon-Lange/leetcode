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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        n = remove( head, n );
        
        if( n != -1 ){
            return head.next;
        }
        return head;
    }
    public int remove( ListNode head, int k ){
        if( head == null ){
            return k;
        }
        
        k = remove( head.next, k );
        
        if( k == -1 )   return k;
        if( k == 0 ){
            //  delete next node
            head.next = head.next.next;
            return -1;
        }
        return k -1;
    }
}

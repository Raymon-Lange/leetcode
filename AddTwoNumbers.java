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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1; // pointer to traverse l1
        ListNode ptr2 = l2; // pointer to traverse l2
        ListNode answer = null;
        int carry = 0;

        //STEP: The 1st node is always going to be ones node

        while(ptr1 != null || ptr2 != null || carry != 0)
        {
            int temp = carry;

            //STEP: Check if pointer is null just sumbiut the value. 
            if(ptr1 != null)
            {
                temp += ptr1.val;
                ptr1 = ptr1.next;
            }

            if(ptr2 != null)
            {
                temp += ptr2.val;
                ptr2 = ptr2.next;
            }

            //STEP: use the % op instead of comparsion for speed and return 1 if ten 

             carry = temp / 10; 
            
            ListNode dum = new ListNode(temp %10 );

            dum.next = answer;
            answer = dum;
        }

        //STEP: Reserse a link list

        ListNode prev = null;
        ListNode next = null;
        while (answer != null) {
            next = answer.next;
            answer.next = prev;
            prev = answer;
            answer = next;
        }
        answer = prev;

        return answer; 
    }
}

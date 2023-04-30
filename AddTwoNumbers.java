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

        String firstNumber = new String();
        String secoundNumber = new String();
        //Step: First covernt the link list to string
        Boolean exit = false;
        ListNode temp = l1;
        do
        {
            firstNumber += String.valueOf(temp.val);
            temp = temp.next;

        }while(temp != null);

        temp = l2;
        do
        {
            secoundNumber += String.valueOf(temp.val);
            temp = temp.next;

        }while(temp != null);
        
        System.out.println(firstNumber);
        System.out.println(secoundNumber);

        //Step: Than resverse  the string 

    
        firstNumber = new StringBuilder(firstNumber).reverse().toString();
        secoundNumber = new StringBuilder(secoundNumber).reverse().toString();

        //Step: convert to a int 

        long num1 = Long.parseLong(firstNumber); 
        long num2 = Long.parseLong(secoundNumber);


        //Step: do math

        long answer = num1 + num2;

        //Step: conver to string 

        String finalAnswer = String.valueOf(answer);
        System.out.println(finalAnswer);
        ListNode value = null;

         for (int i = 0; i <= finalAnswer.length() -1; i++)
         {
             ListNode dum = new ListNode(Character.getNumericValue(finalAnswer.charAt(i)));

             dum.next = value;

             value = dum;
         }


        return value;
        
    }
}

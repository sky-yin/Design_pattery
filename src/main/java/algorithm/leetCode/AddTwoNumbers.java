package algorithm.leetCode;


/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {
    /**  sky-yin  start  **/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calc(l1,l2,new ListNode(0),new ListNode(0));
    }

    public ListNode calc(ListNode l1, ListNode l2, ListNode l3, ListNode ln){
        if (l1 != null || l2!= null || (l3!= null && l3.val>0)){
            if(l1 == null){
                l1 = new ListNode(0);
            }
            int n = l2 == null?0:l2.val;
            int sum = l1.val+n+l3.val;
            l3 = new ListNode(sum/10);
            l1.val = sum%10;
            ListNode lm = new ListNode(l1.val);
            ln.next = lm;
            l1 = l1 == null?null:l1.next==null?null:l1.next;
            l2 = l2 == null?null:l2.next==null?null:l2.next;
            calc(l1,l2,l3,lm);
        }
        return ln.next;
    }
    /**  sky-yin  end  **/
    /**  leetCode start **/
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    /**  leetCode end **/
}



 //Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

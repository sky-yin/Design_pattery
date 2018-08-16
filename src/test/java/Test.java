import java.util.*;
import java.util.regex.Pattern;

public class Test {

    public static Scanner scanner = new Scanner(System.in);

    @org.junit.Test
    public void tests(){

       // 243  564
       ListNode l1 = new ListNode(9);
//       l1.next = new ListNode(4);
//       l1.next.next = new ListNode(3);
       ListNode l2 = new ListNode(1);
       l2.next = new ListNode(9);
       l2.next.next = new ListNode(9);
       l2.next.next.next = new ListNode(9);
       l2.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next.next.next = new ListNode(9);
       l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
       ListNode ln = addTwoNumbers(l1,l2);
        while (ln.next != null){
            System.out.println(ln.val);
            ln=ln.next;
        }
        System.out.println(ln.val);

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode p = l1,q = l2,curr = head;
       int carry = 0;
       while (p != null || q!= null){
           int x = p != null?p.val:0;
           int y = q != null?q.val:0;
           int sum = x+y+carry;

           carry = sum/10;
           curr.next = new ListNode(sum%10);
           curr = curr.next;
           if (q != null) q = q.next;
           if (p != null) p = p.next;
       }
       if (carry>0){
           curr.next = new ListNode(carry);
       }
       return curr;
    }

    @org.junit.Test
    public void findStrLongString(){
        String s = "pwwkew";
        Set<Character> set = new HashSet<>();

        char[] charList = s.toCharArray();

        int length = 0;
        int sum =0;
        for (int i = 0,j=0; i < charList.length; i++) {
            if (set.contains(charList[i])){
                sum = set.size();
                set.clear();
                j++;
                i = j;
                set.add(charList[j]);
                if (sum>length){
                    length = sum;
                }
            }else {
                set.add(charList[i]);
                if (i == charList.length-1){
                    sum = set.size();
                    if (sum>length){
                        length = sum;
                    }
                }
            }
        }

        System.out.println(length);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;};
}

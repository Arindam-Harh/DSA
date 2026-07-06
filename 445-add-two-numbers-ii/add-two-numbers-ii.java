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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverseList(l1);
        ListNode temp2 = reverseList(l2);
        ListNode dummy = new ListNode(0);
        ListNode dHead = dummy;
        int c = 0;
        int sum = 0;
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val + c;
            if(sum >= 10){
                sum = sum % 10;
                c = 1;
            }else{
                c = 0;
            }
            ListNode t = new ListNode(sum);
            dummy.next = t;
            dummy = dummy.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            sum = temp1.val + c;
            if(sum >= 10){
                sum = sum % 10;
                c = 1;
            }else{
                c = 0;
            }
            ListNode t = new ListNode(sum);
            dummy.next = t;
            dummy = dummy.next;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sum =  temp2.val + c;
            if(sum >= 10){
                sum = sum % 10;
                c = 1;
            }else{
                c = 0;
            }
            ListNode t = new ListNode(sum);
            dummy.next = t;
            dummy = dummy.next;
            temp2 = temp2.next;
        }
        if(c == 1){
            dummy.next = new ListNode(c);
        }
        return reverseList(dHead.next);
    }
}
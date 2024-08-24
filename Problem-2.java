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
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
    
    ListNode dummyHead = new ListNode(0);
    ListNode tail = dummyHead;
    int carry = 0;
    
    while (h1 != null || h2 != null || carry != 0) {
        int val1 = (h1 != null) ? h1.val : 0;
        int val2 = (h2 != null) ? h2.val : 0;
        
        int sum = val1 + val2 + carry;
        carry = sum / 10;
        int digit = sum % 10;
        
        ListNode newNode = new ListNode(digit);
        tail.next= newNode;
        tail=tail.next;
        
        h1=(h1!=null)?h1.next:null;
        h2=(h2!=null)?h2.next:null;
    }
    ListNode result= dummyHead.next;
    dummyHead.next=null;
    return result;
}
}

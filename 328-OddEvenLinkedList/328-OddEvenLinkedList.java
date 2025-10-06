// Last updated: 06/10/2025, 20:16:22
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null|| head.next.next == null){
            return head;
        }
        int count = 1;
        ListNode start = head;
        ListNode end = head;
        while(end.next!=null){
            end = end.next;
            count++;
        }
        count /= 2;
        ListNode curr = head;

        while(count-- > 0){
            ListNode Newnext = curr.next;
            curr.next = Newnext.next;
            end.next = Newnext;
            Newnext.next = null;
            end = Newnext;
            curr = curr.next;
        }
        return head;
    }
}
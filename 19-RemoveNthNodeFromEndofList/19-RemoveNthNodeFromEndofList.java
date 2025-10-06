// Last updated: 06/10/2025, 16:25:14
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
        int l = 0;
        ListNode node = head;
        while(node!=null){
            l++;
            node = node.next;
        }
        if(l == n){
            ListNode pt = head.next;
            head = pt;
            pt = null;
            return head;
        }
        int target = l - n;
        ListNode temp = head;
        ListNode prev = null;
        while(target -- > 0){
            prev = temp;
            temp = temp.next;
        }
        if(prev!=null){
            prev.next = temp.next;
        }
        temp = null;
        return head;
    }
}
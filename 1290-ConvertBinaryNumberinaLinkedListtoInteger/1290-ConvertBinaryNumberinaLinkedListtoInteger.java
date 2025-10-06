// Last updated: 06/10/2025, 16:02:52
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
    public int getDecimalValue(ListNode head) {
        // head = reverse(head);
        // int power = 0;
        // int result = 0;
        // while(head != null){
        //     if(head.val == 1){
        //         result+=Math.pow(2,power);
        //         power++;
        //         head = head.next;
        //     }
        // }
        // return result;

        int result = 0;
        while(head!=null){
            result = (result << 1) | head.val;
            head = head.next;
        }
        return result;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
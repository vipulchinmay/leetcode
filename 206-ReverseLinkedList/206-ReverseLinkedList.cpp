// Last updated: 04/10/2025, 15:53:34
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* temp = head;
        ListNode* prev = NULL;
        ListNode* rev = NULL;
        while(temp!=NULL){
            prev = temp->next;
            temp->next = rev;
            rev = temp;
            temp = prev;
        }
        head = rev;
        return head;

    }
};
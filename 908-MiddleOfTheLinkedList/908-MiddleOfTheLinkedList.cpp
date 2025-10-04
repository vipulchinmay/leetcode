// Last updated: 04/10/2025, 15:51:48
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
    ListNode* middleNode(ListNode* head) {
        if(head == NULL){
            return head;
        }
        else{
            ListNode* temp = head;
            ListNode* temp1 = head;
            while(temp!=NULL and temp->next!=NULL){
                temp = temp->next->next;
                temp1 = temp1->next;
            }
            return temp1;
        }
    }
};
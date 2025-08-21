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
    public ListNode deleteDuplicates(ListNode head) {

        
ListNode out = head;

while(out != null && out.next != null){
    if (out.val == out.next.val){
        out.next = out.next.next;
    }else{
        out = out.next;
    }
}


        return head;
        
    }
}
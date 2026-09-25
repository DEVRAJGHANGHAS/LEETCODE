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
        ListNode fist = null;
        ListNode last = head;
        while(last != null){
            ListNode n = last.next;
            last.next=fist;
            fist=last;
            last=n;
        }
        return fist;
    }
}
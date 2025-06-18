/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // length
        int la = getl(headA);
        int lb = getl(headB);

        ListNode a = headA;
        ListNode b = headB;

        while (a != null || b != null) {
            if (la > lb) {
                a = a.next;
                la--;
            }
            else if (la < lb) {
                b = b.next;
                lb--;
            }
            else {
                if (a==b) return a;
                else {
                    a = a.next; la--;
                    b = b.next; lb--;
                }
            }
        }

        return null;
    }

    private int getl(ListNode h) {
        int l = 0;
        while (h.next != null) { h = h.next; l++; }
        return l;
    }
}

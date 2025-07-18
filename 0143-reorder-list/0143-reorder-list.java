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
 // Brut force what I can think of:
// Brut force:
// - divide into half O(n)
// - reverse the second half O(n)
// - merge it O(n)
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;

        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }

        int i = 0; 
        int j = nodes.size() - 1;
        while (i < j) {
            nodes.get(i).next = nodes.get(j);
            i++;
            
            nodes.get(j).next = nodes.get(i);
            j--;
        }
        nodes.get(i).next = null;
    }
}
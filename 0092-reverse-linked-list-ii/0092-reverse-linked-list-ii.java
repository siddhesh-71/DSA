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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        // Store all values
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        left--;
        right--;

        // Reverse values in ArrayList
        while (left < right) {
            int t = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, t);

            left++;
            right--;
        }

        // Put values back into linked list
        temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = arr.get(i++);
            temp = temp.next;
        }

        return head;
    }
}
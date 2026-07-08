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
 /*class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        slow =head;
        while(!fast<=mid && !slow >= mid){
            if (fast==slow){
                fast=fast.prev;
                slow=slow.next;
            }
            return true;
        }
        return false;
    }
} */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        } 
        ArrayList<Integer> arr2 = new ArrayList<>(arr);
        Collections.reverse(arr2);
        if(arr2.equals(arr)){
            return true;
        }
        return false;  
    }
}
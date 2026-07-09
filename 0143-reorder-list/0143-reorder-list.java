class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            arr.get(i).next = arr.get(j);
            i++;

            if (i == j) {
                break;
            }

            arr.get(j).next = arr.get(i);
            j--;
        }

        arr.get(i).next = null;
    }
}
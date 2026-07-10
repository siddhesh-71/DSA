class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean forward = nums[i] > 0;
            int slow = i;
            int fast = i;
            while (true) {
                slow = move(nums, slow, forward);
                if (slow == -1)
                    break;
                fast = move(nums, fast, forward);
                if (fast == -1)
                    break;
                fast = move(nums, fast, forward);
                if (fast == -1)
                    break;
                if (slow == fast)
                    return true;
            }
        }
        return false;
    }

    private int move(int[] nums, int index, boolean forward) {
        boolean dir = nums[index] > 0;
        if (dir != forward)
            return -1;
        int next = (index + nums[index] % nums.length + nums.length) % nums.length;
        if (next == index)
            return -1;
        return next;
    }
}
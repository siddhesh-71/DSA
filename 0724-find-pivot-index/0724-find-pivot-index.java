class Solution {
    public int pivotIndex(int[] nums) {
        int i = 0;
        int left = 0;
        int sum = 0;
        int n = nums.length;

        while (i < n) {
            sum += nums[i];
            i++;
        }

        for (i = 0; i < n; i++) {
            int right = sum - nums[i] - left;

            if (left == right) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }
}
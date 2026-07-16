class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = nums[0];

        int max = nums[0];
        int currMax = nums[0];

        int min = nums[0];
        int currMin = nums[0];

        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {

            total += nums[i];

            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            min = Math.min(min, currMin);
        }

        // All elements are negative
        if (max < 0)
            return max;

        return Math.max(max, total - min);
    }
}
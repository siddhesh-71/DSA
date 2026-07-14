class Solution {
    public int maxSubArray(int[] nums) {
        int i =0;
        int best=nums[i];
        int ans=nums[i];
        int n = nums.length;
        for(i=1;i<n;i++){
            int v1=best+nums[i];
            int v2=nums[i];
            best=Math.max(v1,v2);
            ans=Math.max(ans,best);
        }
        return ans;
    }
}
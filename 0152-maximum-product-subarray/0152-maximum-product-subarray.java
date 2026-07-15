class Solution {
    public int maxProduct(int[] nums) {
        int i =0;
        int res = nums[i];
        int min=nums[i];
        int max=nums[i];
        for(i =1;i<nums.length;i++){
            int v1=nums[i];
            int v2=min*nums[i];
            int v3=max*nums[i];
            max=Math.max(v1,Math.max(v2,v3));
            min=Math.min(v1,Math.min(v2,v3));
            res = Math.max(res,Math.max(max,min));
        }
        return res;
    }
}
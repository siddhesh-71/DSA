class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast =0;
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(slow==fast){
            slow=0;
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            return slow;
            }
        }
    }
}
/**class Solution {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        // Phase 1: Find the meeting point
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        // Phase 2: Find the duplicate number
        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}**/
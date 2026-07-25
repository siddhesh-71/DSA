class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int x =nums[i];
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>nums.length/3){
               ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
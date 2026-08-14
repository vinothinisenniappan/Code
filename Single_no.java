class Solution {
    public int singleNumber(int[] nums) {
        int k=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            k = nums[i];
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1)
            {
                return nums[i];
            }
        }
        return k;
    }
}
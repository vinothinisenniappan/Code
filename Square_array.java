class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sums = 0;
        int d=0;
        int m=Integer.MAX_VALUE;
        int c =0;
     for(int i=0;i<nums.length-2;i++){
        for(int j=i+1;j<nums.length-1;j++){
            for(int k=j+1;k<nums.length;k++){
                sums = nums[i]+nums[j]+nums[k];
                d = Math.abs(sums-target);
                if(d<m){
                m = d;
                c = sums;
            }
        }
     } }  
     return c;
    }
}
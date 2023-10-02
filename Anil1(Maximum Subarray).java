class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        // containing at least one number has largest sum
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            // if we found sum is negative then sum = 0
            // we want largest sum
            if(sum<0){
                sum = 0;
            }
            sum = sum + nums[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}

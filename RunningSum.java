class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length==1)
        {
            return nums;
        }
        int sums=0;
        for(int i=0; i<nums.length; i++)
        {
            sums += nums[i];
            nums[i] = sums;
        }
        return nums;
    }
}

class Solution {
    public int findClosestNumber(int[] nums)
     {
        int max=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return 0;
            }
            else if(Math.abs(nums[i])<max||nums[i]==Math.abs(max))
            {
                max=Math.abs(nums[i]);
                res=nums[i];

            }
        }

       return res; 
    }
}
class Solution {
    public int maxProductDifference(int[] nums)
     {
        int n=nums.length;
        int n1=0;
        int n2=0;
        int ans=0;
        Arrays.sort(nums);
        n1=nums[0]*nums[1];
        n2=nums[n-1]*nums[n-2];
        ans=n2-n1;
        return ans;
    }
}
class Solution {
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int mul=1;
        int n=nums.length;
        
        mul=Math.max((nums[n-3]*nums[n-2]*nums[n-1]),(nums[0]*nums[1]*nums[n-1]));
       return mul;
    }
}
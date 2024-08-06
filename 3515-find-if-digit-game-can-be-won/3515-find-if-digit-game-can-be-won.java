class Solution {
    public boolean canAliceWin(int[] nums)
     {
       int n=nums.length;
       int singledig=0;
       int doubledig=0;
       for(int i=0;i<n;i++)
       {
        if(nums[i]<10)
        {
            singledig=singledig+nums[i];
        }
        else
        {
            doubledig=doubledig+nums[i];
        }
       }
       if(singledig==doubledig)
       {
        return false;
       }
       return true;

        
    }
}
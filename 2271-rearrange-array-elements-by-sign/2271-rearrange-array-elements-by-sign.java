class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int k[]=new int[nums.length];
        int p1=0;
        int p2=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
              k[p2]=nums[i];
              p2=p2+2;
            }

             if(nums[i]>0)
            {
              k[p1]=nums[i];
              p1=p1+2;
            }
        }
        return k;
    }
}
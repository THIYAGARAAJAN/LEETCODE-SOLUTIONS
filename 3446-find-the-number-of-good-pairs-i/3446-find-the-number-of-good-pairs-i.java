class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k)
     {
        int count=0;
        for(int i=0;i<=nums1.length-1;i++)
        {
            for(int j=0;j<=nums2.length-1;j++)
            {
                if(nums1[i]%(nums2[j]*k)==0)
                {
                     count++;
                }
            }
        }

     return count;
    }
    
}
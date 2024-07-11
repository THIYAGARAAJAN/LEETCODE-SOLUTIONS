class Solution {
    public int thirdMax(int[] nums)
     {
        Arrays.sort(nums);
        List<Integer>li=new ArrayList<>();
         li.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                li.add(nums[i]);
            }
        }
        if(li.size()<3)
        {
            return li.get(li.size()-1);
        }
        return li.get(li.size()-3);
            

        
    }
}
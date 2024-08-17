class Solution 
{
    public String largestNumber(int[] nums) 
    {
      
        String[] num = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            num[i] = String.valueOf(nums[i]);

        for(int i = 0; i < num.length - 1; i++)
        {
            for(int j = i + 1; j < num.length; j++)
            {
                String s1 = num[i] + num[j];
                String s2 = num[j] + num[i];
                if(s2.compareTo(s1) > 0)
                {
                    String temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        if(num[0].equals("0"))
        return "0";

        StringBuilder ans = new StringBuilder();
        for(String i : num)
        ans.append(i);


        return ans.toString();
    }
}
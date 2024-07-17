class Solution {
    public boolean halvesAreAlike(String s) 
    {
        int n=s.length();
        int i=0;int j=n-1;
         s =s.toLowerCase();
        int left=0;int right=0;
        while(i<j)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                left++;
                

            }
             if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
             {
                right++;
                
             }
             i++;
             j--;

        }
        if(right==left)
        {
            return true;
        }
        return false;


        
    }
}
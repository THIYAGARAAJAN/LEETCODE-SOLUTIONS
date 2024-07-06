class Solution {
    public int reverse(int x)
     {
        if(x==0)
        {
            return 0;
        }
        long rem=0;
        while(x>0||x<0)
        {
            int ans=x%10;
            rem=rem*10+ans;
            x=x/10;


        }
        return (rem<Integer.MIN_VALUE||rem>Integer.MAX_VALUE)? 0:(int)rem;
    }
}
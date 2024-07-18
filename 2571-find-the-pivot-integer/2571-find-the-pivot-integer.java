class Solution {
    public int pivotInteger(int n)
     {
       
        int ans=-1;
        for(int mid=1;mid<=n;mid++)
        {
             int frontsum=0;
        int backsum=0;

        for(int i=1;i<=mid;i++)
        {
            frontsum=frontsum+i;
        }
        for(int j=mid;j<=n;j++)
        {
            backsum=backsum+j;
        }
        
        if(frontsum==backsum)
        {
            ans=mid;
        }
        }
        return ans;


    }
}
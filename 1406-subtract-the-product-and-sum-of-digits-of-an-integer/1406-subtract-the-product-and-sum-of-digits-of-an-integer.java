class Solution {
    public int subtractProductAndSum(int n)
     {
        int a=0;
        int sum=0;
       int  b=0;
        int mul=1;
        int temp=n;
        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
            
            
        }
        while(temp>0)
        {
            b=temp%10;
            mul=mul*b;
            temp=temp/10;
            
        }
        return mul-sum;
        
    }
}
class Solution {
    public int minimumChairs(String s) 
    {
       int count=0;
       int max=Integer.MIN_VALUE;
       char ch[]=s.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
        if(ch[i]=='E')
        {
            count++;
        }
        else if(ch[i]=='L')
        {
            count--;
        }
        max=Math.max(count,max);
        
       }
       return max;
       
        
    }
}
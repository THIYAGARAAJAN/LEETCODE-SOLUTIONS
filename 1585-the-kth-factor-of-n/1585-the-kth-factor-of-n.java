class Solution {
    public int kthFactor(int n, int k) 
    {
        int arr[]=new int[n];
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                al.add(i);
            }
        } 
        if(k>al.size())
        {
            return -1;
        }  
        else
        {
            return al.get(k-1);
            }    }
        
}
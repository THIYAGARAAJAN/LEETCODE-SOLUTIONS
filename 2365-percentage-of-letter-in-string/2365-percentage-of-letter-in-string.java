class Solution {
    public int percentageLetter(String s, char letter) 
    {
        int output=0;
        int output1=0;
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }
        }
        output=count*100/n;
    
            
        return output;
    }
}
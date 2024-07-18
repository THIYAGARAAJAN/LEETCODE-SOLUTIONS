class Solution {
    public char findTheDifference(String s, String t) 
    {
        int s1=0;
        int s2=0;
        for(int i=0;i<s.length();i++)
        {
            s1=s1+s.charAt(i);
        }
        for(int j=0;j<t.length();j++)
        {
            s2=s2+t.charAt(j);
        }
        return (char)(s2-s1);
        
    }
}
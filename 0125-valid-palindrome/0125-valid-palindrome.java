class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.replaceAll("[^A-Za-z0-9]","");
        String k=s.toLowerCase();
        int i=0;
        int j=k.length()-1;
        while(i<j)
        {
            if(k.charAt(i)!=k.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
       return true; 
    }
}
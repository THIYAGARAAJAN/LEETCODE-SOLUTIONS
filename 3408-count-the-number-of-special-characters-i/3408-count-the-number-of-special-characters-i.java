class Solution {
    public int numberOfSpecialChars(String word) 
    {
       char s[]=word.toCharArray();
        HashSet<Character>lc=new HashSet<>();
        HashSet<Character>uc=new HashSet<>();
        for(int i=0;i<s.length;i++)
        {
            char w=s[i];
            if(Character.isLowerCase(w))
            {
                lc.add(w);
            }
            else
            {
                char c = Character.toLowerCase(w);
                uc.add(c);
            }
        }
        int sum=0;
        for( char v:lc)
        {
            if(uc.contains(v))
            {
                sum++;
            }
        }
      return sum;  
    }
}
class Solution {
    public String finalString(String s)
     {
        StringBuilder sr=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {

        
        if(s.charAt(i)=='i')
        {
            sr=sr.reverse();

        }
        else
        {
            sr.append(s.charAt(i));
        }
        }
       return sr.toString();
    }
}
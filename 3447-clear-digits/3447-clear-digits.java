class Solution {
    public String clearDigits(String s) 
    {
      StringBuilder stack=new StringBuilder();
      for(int i=0;i<s.length();i++)
      { char ch=s.charAt(i);
      if(ch<'0'||ch>'9')
      {
        stack.append(ch);
      }
      else if(stack.length()>0)
      {
        stack.deleteCharAt(stack.length()-1);
      }

      }
     return stack.toString();    

    }
}
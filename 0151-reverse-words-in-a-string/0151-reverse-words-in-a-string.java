class Solution {
    public String reverseWords(String s) {
        String result="";
        int i=0,j=0,len = s.length();
        
        while(i<len){
            while(i<len&&s.charAt(i)==32){
                i++;
            }
            j=i;

            while(j<len&&s.charAt(j)!=32){
                j++;
            }
            result=s.substring(i,j)+" "+result;
            
            i=j;
        }
    return result.trim();
    }
}
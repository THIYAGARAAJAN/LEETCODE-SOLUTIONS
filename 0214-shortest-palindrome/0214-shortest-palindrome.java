class Solution {
    public String shortestPalindrome(String s) {
        String sr = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith(sr.substring(i))) {
                return sr.substring(0, i) + s;
            }
        }
        return sr + s;
    }
}
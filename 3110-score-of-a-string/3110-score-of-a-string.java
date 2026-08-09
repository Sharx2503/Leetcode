class Solution {
    public int scoreOfString(String s) {
        int r=0;
        for(int i=1;i<s.length();i++){
            r+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return r;
    }
}
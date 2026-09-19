class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_len=0;
        for (String currSent:sentences) {
            int currLen=currSent.split(" ").length;
            if (max_len<currLen)
                max_len=currLen;
        }
        return max_len;
    }
}
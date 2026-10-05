class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int num:nums){
            int t=num;
            while(t!=0){
                int r=t%10;
                if(r==digit){
                    c++;
                }
                t/=10;
            }
        }
        return c;
    }
}
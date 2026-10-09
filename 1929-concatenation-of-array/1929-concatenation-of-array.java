class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length*2;
        int a[]=new int [n];
        int j=0;

        for(int i=0;i<n;i++){
            a[i]=nums[j];
            j++;
            if(j==nums.length)j=0;
        }
        return a;
    }
}
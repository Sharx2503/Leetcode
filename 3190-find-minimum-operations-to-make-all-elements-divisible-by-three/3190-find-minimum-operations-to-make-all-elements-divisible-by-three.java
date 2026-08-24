class Solution {
    public int minimumOperations(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                m++;
            }
        }
        return m;
    }
}
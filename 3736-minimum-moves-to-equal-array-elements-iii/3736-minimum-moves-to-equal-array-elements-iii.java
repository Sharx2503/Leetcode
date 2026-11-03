class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=max){
                int t=max-nums[j];
                s+=t;
            }

    }
    return s;
}
}
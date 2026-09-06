class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        while(k!=0){
            int min=nums[0],q=0;
            for(int i=0;i<nums.length;i++){
                if(min>nums[i]){
                    min=nums[i];
                    q=i;
                }
            }
            nums[q]=min*multiplier;
            k--;
        }
        return nums;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int capacity=0;
        int cur_a=0;
        while(left<right){
            int width=right-left;
            cur_a=Math.min(height[left],height[right])*width;
            capacity=Math.max(capacity,cur_a);

            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return capacity;
        
    }
}
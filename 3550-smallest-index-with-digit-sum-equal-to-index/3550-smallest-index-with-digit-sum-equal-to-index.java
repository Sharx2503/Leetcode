class Solution {
    public int smallestIndex(int[] nums) {
      int s=0;
      for(int i=0;i<nums.length;i++){
        int t=nums[i];
        while(t!=0){
            int r=t%10;
            s+=r;
            t/=10;
        }
        if(s==i)return i;
        else{
            s=0;
        }
      }
      return -1;  
    }
}
class Solution {
    public int smallestIndex(int[] nums) {
      for(int i=0;i<nums.length;i++){
        int t=nums[i];
         int s=0;
        while(t>0){
            int r=t%10;
            s+=r;
            t/=10;
        }
        if(s==i)return i;
       
      }
      return -1;  
    }
}
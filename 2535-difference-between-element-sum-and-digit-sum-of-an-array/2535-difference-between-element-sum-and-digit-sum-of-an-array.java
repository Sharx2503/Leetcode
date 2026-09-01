class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0,ds=0,t,r;
        for(int i=0;i<nums.length;i++){
            es+=nums[i];
             t=nums[i];
            while(t!=0){
                 r=t%10;
                ds+=r;
                t/=10;
            }
                   }
                   return Math.abs(es-ds);
    }
}
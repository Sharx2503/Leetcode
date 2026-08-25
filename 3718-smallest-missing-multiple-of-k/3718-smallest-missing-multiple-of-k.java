class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list=new ArrayList<Integer>();
        for(int ch:nums){
            list.add(ch);
        }
        int i=1;
        while(i<=nums.length+1){
        if(list.contains(k*i)){
            i++;
        }
        else{
            return k*i;
        }
    }
    return -1;
}
}
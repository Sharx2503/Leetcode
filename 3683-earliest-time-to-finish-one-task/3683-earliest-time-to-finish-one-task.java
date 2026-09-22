class Solution {
    public int earliestTime(int[][] tasks) {
        int r=Integer.MAX_VALUE;
        for(int[]task:tasks){
            r=Math.min(r,task[0]+task[1]);
        }
        return r;
    }
}
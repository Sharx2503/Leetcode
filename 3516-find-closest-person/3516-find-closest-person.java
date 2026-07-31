class Solution {
    public int findClosest(int x, int y, int z) {
        int p=Math.abs(z-x);
        int k=Math.abs(z-y);
        if(p==k){
            return 0;
        }
        else{
            return (p<k)?1:2;
        }
    }
}
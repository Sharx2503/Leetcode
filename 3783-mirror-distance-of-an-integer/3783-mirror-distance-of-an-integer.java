class Solution {
    public int mirrorDistance(int n) {
        int q=n,s=0;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        return Math.abs(s-q);
    }
}
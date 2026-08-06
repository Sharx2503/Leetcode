class Solution {
    public int smallestNumber(int n, int t) {
        return pro(n,t);
    }
        public int pro(int n,int t){
        int f=n;
        int p=1;
        while(f!=0){
            int r=f%10;
            p=p*r;
            f/=10;
        }
        if(p%t==0){
            return n;
        }
        else{
            return pro(n+1,t);
        }
    }
}
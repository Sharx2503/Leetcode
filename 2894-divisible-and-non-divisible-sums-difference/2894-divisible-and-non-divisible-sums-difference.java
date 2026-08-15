class Solution {
    public int differenceOfSums(int n, int m) {
        int d=0,nd=0,k=n;
        while(k!=0){
            if(k%m!=0){
                nd+=k;
                k--;
            }
            else{
                d+=k;
                k--;
            }
        }
        return nd-d;
    }
}
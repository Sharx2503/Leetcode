class Solution {
    public int maxProduct(int n) {
        int max=0;
        int k1=0;
        int k2=0;
        
        while(n!=0){
            int r=n%10;
            if(r>=k1){
                k2=k1;
                k1=r;
            }
            else if(r>k2){
                k2=r;
            }
            n/=10;
        }
        return k1*k2;
    }
}
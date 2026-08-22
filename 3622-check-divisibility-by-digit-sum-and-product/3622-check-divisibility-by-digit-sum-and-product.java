class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n,s=0,p=1;
        while(temp!=0){
            int t=temp%10;
            s+=t;
            p=p*t;
            temp/=10;
        }
        int d=s+p;
        if(n%d==0){
            return true;
        }
        else{
            return false;
        }
    }
}
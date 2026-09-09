class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=0,t=x;
        while(x!=0){
            int r=x%10;
            a+=r;
            x/=10;
        }
        if(t%a==0){
            return a;
        }
        return -1;
    }
}
class Solution {
    public int sumOfMultiples(int n) {
        int i=n,s=0;
        while(i!=0){
            if(i%3==0||i%5==0||i%7==0) s+=i;
            i--;
        }
        return s;
    }
}
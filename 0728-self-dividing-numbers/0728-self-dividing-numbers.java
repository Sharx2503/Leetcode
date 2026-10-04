class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> a = new ArrayList<>();
       
        for(int i=left;i<=right;i++){
            int c=i;
             int s=0,q=0;
             boolean valid = true;
            while(c!=0){
                int t=c%10;
                if (t == 0) {
                    valid = false;
                    break;
                }
                s+=t;
                if(i%t==0){
                    q+=t;
                }
                c/=10;
                }
            if(valid&&s==q){
              a.add(i);
            }
        }
        return a;
    }
}
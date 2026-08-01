class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0;
        for(int i=0;i<accounts.length;i++){
            int temp=0;
           for(int j=0;j<accounts[i].length;j++){
            temp+=accounts[i][j];
           }
           if(s<temp){
            s=temp;
           } 
        }
        return s;
    }
}
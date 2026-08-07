class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int [] a=new int[friends.length];
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            ans.add(friends[i]);
        }
        int k=0;
      for(int j=0;j<order.length;j++){
        if(ans.contains(order[j])){
        a[k]=order[j];
        k++;
        }
      }
      return a;
    }
}
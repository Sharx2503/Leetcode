import java .util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
int t=0;
     ArrayList<Integer> list = new ArrayList<>();
     for(int candy:candies){
        list.add(candy);
     }
     int max=Collections.max(list);
     List<Boolean> res=new ArrayList<>();
     for(int i=0;i<candies.length;i++){
       res.add(candies[i]+extraCandies>=max);
        
     }  
     return res;
    }
}
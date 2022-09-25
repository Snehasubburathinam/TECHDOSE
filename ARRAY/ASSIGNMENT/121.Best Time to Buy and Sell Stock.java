class Solution {
    public int maxProfit(int[] price) {
        if(price.length==0){
          return 0;
        }
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<price.length;i++){
           if(min>price[i])
               min=price[i];
           else if(profit<price[i]-min)
               profit=price[i]-min;
        }     
        return profit;
    }
}

class Solution {
      public int countEven(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if(sumDig(i)){
                c++;
            }
        }
        return c;  
       }
       boolean sumDig(int num){
            int s=0;
            while(num>0){
                s+=num%10;
                num/=10;
            }
          return (s%2==0);
       }
}

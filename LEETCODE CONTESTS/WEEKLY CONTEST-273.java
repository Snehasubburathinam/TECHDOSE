class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        int res1=reverse(num);
        int res2=reverse(res1);
        return res2==num;
    }
    public int reverse(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res=(res*10)+rem;
            n/=10;
        }
        return res;
    }
}

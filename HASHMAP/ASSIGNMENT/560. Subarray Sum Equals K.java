class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int []s=new int[n+1];
        s[0]=0;
        for(int i=1;i<=n;i++){
            s[i]=s[i-1]+nums[i-1];
        }
        int c=0;
        for(int i=0;i<s.length;i++){  
            for(int j=i+1;j<s.length;j++){
                if((s[j]-s[i])==k){
                    c++;
                }
            }
        }
        return c;
    }
}
//
class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>hp=new HashMap<Integer,Integer>();
        int s=0;
        int c=0;
        hp.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            c+=hp.getOrDefault(s-k,0);
            hp.put(s,hp.getOrDefault(s,0)+1);
        }
        return c;
    }
}

class Solution {
    private void combination(int x,int[]a,int target,List<List<Integer>>res,List<Integer>l){
        if(x==a.length){
            if(target==0){
                res.add(new ArrayList<>(l));
            }
            return;
        }
        if(a[x]<=target){
            l.add(a[x]);
            combination(x,a,target-a[x],res,l);
            l.remove(l.size()-1);
        }
        combination(x+1,a,target,res,l);
    }
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>>res=new ArrayList<>();
    combination(0,candidates,target,res,new ArrayList<>());
    return res;
    }
}

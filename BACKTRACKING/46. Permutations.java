class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        permutations(nums,0,nums.length-1,list);
        return list;
    }
    public void permutations(int a[],int start,int end,List<List<Integer>>list){
        if(start==end){
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<=end;i++){
                l.add(a[i]);
            }
            list.add(l);
        }
        else{
            for(int i=start;i<=end;i++){
                swap(a,start,i);
                permutations(a,start+1,end,list);
                swap(a,start,i);
            }
        }
    }
    public void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

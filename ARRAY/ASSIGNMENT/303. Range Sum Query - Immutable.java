class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        this.arr=nums;int s=0;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return left==0?arr[right]:arr[right]-arr[left-1];
    }
}

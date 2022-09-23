class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        mergeSort(nums, left, right);
        return nums;
    }
    
    public void mergeSort(int nums[], int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    
    int sorted[] = new int[500000];
    
    public void merge(int nums[], int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int k = left;
        while(i <= mid && j <= right){
            if(nums[i] < nums[j]){
                sorted[k] = nums[i];
                i++;
            }
            else{
                sorted[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            sorted[k] = nums[i];
            k++;
            i++;
        }
        while(j <= right){
            sorted[k] = nums[j];
            k++;
            j++;
        }
    
        for(k = left; k <= right; k++){
            nums[k] = sorted[k];
        }
        
    }
}

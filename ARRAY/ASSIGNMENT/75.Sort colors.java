class Solution {
    public void sortColors(int[] arr) {
      int n=arr.length;
      for(int i=0;i<n;i++){
      int minIndex=i;
      for(int j=i+1;j<n;j++){
        if(arr[minIndex]>arr[j]){
          minIndex=j;
        }
      }
      int temp=arr[minIndex];
      arr[minIndex]=arr[i];
      arr[i]=temp;
    }
    }
}

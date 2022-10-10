class Solution {
  public List<List<Integer>> threeSum(int[] nums){
      int n=nums.length;
      Arrays.sort(nums);
      List<List<Integer>> res=new ArrayList<List<Integer>>();
      for(int i=0;i<n-2;i++){
          if(i>0 && nums[i]==nums[i-1]) continue;
          int low=i+1;
          int high=n-1;
          while(low<high){
              int s=nums[i]+nums[low]+nums[high];
              if(s==0){
                  res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                  while(low<high && nums[low]== nums[low+1]) low++;
                  while(low<high && nums[high]== nums[high-1]) high--;
                  low++;
                  high--;
                  
              }
              else if(s>0){
                  high--;
              }
              else{
                  low++;
              }
           }
         }
  
          return res;
      }
  }

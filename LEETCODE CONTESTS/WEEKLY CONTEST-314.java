class Solution {
    public int hardestWorker(int n, int[][] logs) {
    int time = 0, maxi = 0, id = 0;
    for(int[] l : logs) {
      int cur_time = l[1] - time;
      if(cur_time > maxi || (cur_time == maxi && id > l[0])){ 
          maxi = cur_time; 
          id = l[0];
      }
      time = l[1];
    }
    return id;
    }
}

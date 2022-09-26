class Solution {
    public int[][] merge(int[][] arr) {
      List<int[]> m=new ArrayList<>();
        if(arr.length<=1) return arr;
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int start=arr[0][0];
        int end=arr[0][1];
        for(int[] i:arr)
        {
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }else{
                m.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        m.add(new int[]{start,end});
        return m.toArray(new int[0][]);
    }
}

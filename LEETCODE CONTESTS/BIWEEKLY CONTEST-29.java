class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        Arrays.sort(salary);
        double x=0;
       for(int i=1;i<n-1;i++){
           x+=salary[i];
        }
        return x/(n-2);
    }
}

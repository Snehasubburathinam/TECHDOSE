class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n2<n1){
            return findMedianSortedArrays(nums2,nums1);
        }
        int mid=(n1+n2+1)/2;
        int c1,c2,l1,l2,r1,r2;
        int l=0,h=n1;
        double r=0;
        while(l<=h){
            c1=(l+h)/2;
            c2=mid-c1;
            
            if(c1==0) l1=Integer.MIN_VALUE;
            else l1=nums1[c1-1];
            
            if(c1==n1) r1=Integer.MAX_VALUE;
            else r1=nums1[c1];
            
            if(c2==0) l2=Integer.MIN_VALUE;
            else l2=nums2[c2-1];
            
            if(c2==n2) r2=Integer.MAX_VALUE;
            else r2=nums2[c2];
            
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0){
                    r=(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    r=Math.max(l1,l2);
                }
                return r;
            }else if(l1>l2){
                h=c1-1;
            }else{
                l=c1+1;
            }
        }
        return r;
    }
}

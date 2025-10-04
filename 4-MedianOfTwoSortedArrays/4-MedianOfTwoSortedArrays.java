// Last updated: 04/10/2025, 15:55:21
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int res[] = new int[n+m];
       int i=0;
       int j=0;
       int r = 0;
       while(i<n && j<m){
        if(nums1[i]<nums2[j]){
            res[r] = nums1[i];
            i++;
            r++;
        }
        else{
            res[r] = nums2[j];
            j++;
            r++;
        }
       }
       while(i<n){
        res[r] = nums1[i];
        i++;
        r++;
       }
       while(j<m){
        res[r] = nums2[j];
        j++;
        r++;
       }
       if((n+m)%2 == 1){
        return res[(n+m)/2];
       }
       else{
        int mid1 = res[((n+m) / 2) - 1];
        int mid2 = res[(n+m) / 2];
        return (mid1 + mid2) / 2.0;
       }
    }
}

        
           
            
            
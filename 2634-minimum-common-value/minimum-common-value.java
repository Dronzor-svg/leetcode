class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Set<Integer> st=new HashSet<>();
        // for(int i=0;i<nums1.length;i++)
        // {
        //     st.add(nums1[i]);
        // }

        // for(int i=0;i<nums2.length;i++)
        // {
        //     if(st.contains(nums2[i])) return nums2[i];
        // }


        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (nums1[len1 - 1] < nums2[0] || nums2[len2 - 1] < nums1[0]) {
            return -1;
        }
        while (i < len1 && j < len2) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
}
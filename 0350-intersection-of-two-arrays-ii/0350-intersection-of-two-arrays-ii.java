class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int res[] = cal(nums1, nums2);
            return res;
        }

        int res[] = cal(nums2, nums1);
        return res;

    }

    public static int[] cal(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                i++;

                list.add(nums2[j]);
                j++;
            } else if (nums1[i] > nums2[j])
                j++;
            else {
                i++;
            }

        }
        int k = 0;
        int res[] = new int[list.size()];
        for (int num : list) {
            res[k++] = num;
        }
        return res;
    }
}

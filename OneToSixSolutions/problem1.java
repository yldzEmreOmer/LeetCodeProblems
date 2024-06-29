package OneToSixSolutions;

import java.util.Arrays;

public class problem1 {

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        // int[] nums1 = { 1 };
        // int m = 1;
        // int[] nums2 = {};
        // int n = 0;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = m;
        int[] nums = nums1;
        for (int i = 0; i < m; i++) {
            nums1[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums1[a] = nums2[i];
            a++;
        }

        Arrays.sort(nums1);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
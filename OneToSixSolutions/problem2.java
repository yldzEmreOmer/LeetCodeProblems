package OneToSixSolutions;

import java.util.Arrays;

public class problem2 {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }
}

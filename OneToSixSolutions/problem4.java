package OneToSixSolutions;

public class problem4 {

    public static int removeDuplicates(int[] nums) {
        int k = 2;
        if (nums.length <= 2) {
            return nums.length;
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[k] != nums[i - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}

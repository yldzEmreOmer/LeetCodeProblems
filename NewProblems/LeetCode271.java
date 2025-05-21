package NewProblems;

import java.util.HashSet;

public class LeetCode271 {

    // Find duplicate in an array

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (Integer a : seenNumbers) {
            if (seenNumbers.contains(a)) {
                return true;
            }

            seenNumbers.add(a);
        }
        return false;
    }

}

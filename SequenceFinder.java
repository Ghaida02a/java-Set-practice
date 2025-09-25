import java.util.HashSet;
import java.util.Set;

class SequenceFinder {
    public static void main(String[] args) {
        SequenceFinder finder = new SequenceFinder();

        int[] nums1 = {100, 4, 200, 1, 3, 2};//supposed to be = 4

        System.out.println("Longest consecutive sequence: " + finder.longestConsecutiveSequence(nums1)); // 4
    }
    /*
     * TO-DO: Find the length of the longest consecutive sequence of numbers in an array.
     * This must be implemented in O(n) time complexity.
     \*
     * @param nums An unsorted array of integers.
     * @return The length of the longest sequence.
     */
    public int longestConsecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet){
            if(!numSet.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
            else{
                return longestStreak;
            }
        }

        return longestStreak;
    }
}
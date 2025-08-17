class Solution {
    public boolean canJump(int[] nums) {
        // let's check something new on leetsync, notes are not inclucded.
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex)
                return false;

            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return true;
    }
}
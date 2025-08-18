class Solution {
    public int jump(int[] nums) {
        int maxDistance = 0, jumps = 0, currentEnd = 0;
        if (nums[0] == 0 || nums.length == 1) {
            return jumps;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > maxDistance) {
                break;
            }

            maxDistance = Math.max(maxDistance, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = maxDistance;
                if (currentEnd >= nums.length-1) {
                    return jumps;
                }
            }
        }

        return jumps;
        
    }
}
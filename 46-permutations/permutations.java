class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] taken = new boolean[nums.length]; // track used elements

        permutation(nums, curr, ans, taken);
        return ans;
    }

    private void permutation(int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] taken) {
        // 1️⃣ Base condition — when current permutation is complete
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr)); 
            return;
        }

        // 2️⃣ Try each number at current position
        for (int i = 0; i < nums.length; i++) {
            if (taken[i]) continue; // skip if already used

            // 3️⃣ Choose this number
            taken[i] = true;
            curr.add(nums[i]);

            // 4️⃣ Explore deeper
            permutation(nums, curr, ans, taken);

            // 5️⃣ Backtrack — undo the choice
            taken[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
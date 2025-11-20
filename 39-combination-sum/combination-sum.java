class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        if(target == 0 || candidates.length == 0) return ans;
        List<Integer> curr = new ArrayList<>();

        combos(0, 0, candidates, target, curr, ans);

        return ans;
        
    }

 public void combos(int i, int currSum, int[] array, int target,
                       List<Integer> curr, List<List<Integer>> ans) {
        if (currSum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (i == array.length || currSum > target) return;

        // take: allow reuse of same candidate -> recurse with same index i
        curr.add(array[i]);
        currSum += array[i];
        combos(i, currSum, array, target, curr, ans); // note: i (not i+1)

        // backtrack
        curr.remove(curr.size() - 1);
        currSum -= array[i];

        // non-take: move to next candidate
        combos(i + 1, currSum, array, target, curr, ans);
    }
}
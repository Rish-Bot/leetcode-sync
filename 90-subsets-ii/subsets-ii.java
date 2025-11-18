class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        set(nums, 0, curr, ans);
        return ans;
        
    }

    void set(int[] n, int i, List<Integer> curr, List<List<Integer>> ans) {
        if(n.length == i) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        //take
     
                curr.add(n[i]);
                set(n, i+1, curr , ans);
                 curr.remove(curr.size()-1);

        while(i < n.length - 1 && n[i] == n[i+1]){
            i++;
        }
        
       //non-take
       set(n, i+1, curr, ans);
    }
}
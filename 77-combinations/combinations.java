class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        if(k == 0) return ans;
        List<Integer> curr = new ArrayList<>();

        combo(1, n, k, curr, ans);

        return ans;
        
    }

    public void combo(int i, int n, int k, List<Integer> curr, List<List<Integer>> ans) {
        if(curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(i > n) return;

        //take
        curr.add(i);
        combo(i+1, n, k, curr, ans);
        curr.remove(curr.size()-1);

        //non-take
        combo(i+1, n, k, curr, ans);
    }
}
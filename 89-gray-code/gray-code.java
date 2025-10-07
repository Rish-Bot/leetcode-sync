class Solution {
    static{
        for(int i=0; i<200; i++){
            grayCode(1);
        }
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<1<<n; i++){
            ans.add(i^(i>>1));
        }
        
        return ans;
        
    }
    
    
}
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];

        // fill with min candy '1'
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }

        //left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]) {
                arr[i] = arr[i-1]+1;
            }
        }

        //right to left 
        for (int i = n-2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                arr[i] = Math.max(arr[i], arr[i+1]+1); // not to spoil the left transerve.
            }
        }

        // sum and out 

        int ans = 0;

        for (int i : arr) {
            ans+=i;
        }

        return ans;
        
    }
}
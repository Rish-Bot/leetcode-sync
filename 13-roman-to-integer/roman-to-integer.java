class Solution {
    public int romanToInt(String s) {
        // Predefine values for Roman numerals using an array
        int[] values = new int[128]; // ASCII size, so direct O(1) lookup
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int curr = values[s.charAt(i)];
            int next = (i < s.length() - 1) ? values[s.charAt(i + 1)] : 0;
            
            if (curr < next) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        
        return ans;
    }
}
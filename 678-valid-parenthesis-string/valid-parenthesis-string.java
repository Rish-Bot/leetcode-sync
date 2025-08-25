import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkValidString(String s) {
        // memo: key = index + "," + count
        Map<String, Boolean> memo = new HashMap<>();
        return dfs(s, 0, 0, memo);
    }

    private boolean dfs(String s, int index, int count, Map<String, Boolean> memo) {
        // invalid state
        if (count < 0) return false;

        // base case
        if (index == s.length()) {
            return count == 0;
        }

        String key = index + "," + count;
        if (memo.containsKey(key)) return memo.get(key);

        char c = s.charAt(index);
        boolean valid = false;

        if (c == '(') {
            valid = dfs(s, index + 1, count + 1, memo);
        } else if (c == ')') {
            valid = dfs(s, index + 1, count - 1, memo);
        } else { // '*'
            valid = dfs(s, index + 1, count + 1, memo)   // '*' as '('
                  || dfs(s, index + 1, count - 1, memo)   // '*' as ')'
                  || dfs(s, index + 1, count, memo);      // '*' as empty
        }

        memo.put(key, valid);
        return valid;
    }
}
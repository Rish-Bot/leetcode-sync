class Solution {
    public boolean isPalindrome(int x) {

        //reverse number 
        int duplicate = x, rev = 0;

        while (duplicate>0){
            int l = duplicate%10;
            rev = (rev*10)+l;
            duplicate /= 10;
        }
        return rev == x;
        
    }
}
class Solution {
    public void sortColors(int[] nums) {
        //DNF Algo

        int start = 0, mid = 0, end = nums.length-1;

        for(int i = 0; i<nums.length; i++){

            if (nums[mid] == 0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;

                start += 1;
                mid += 1;
            }else if(nums[mid] == 1)
                mid++;
            else {
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;

                end--; //Highlight when the element is changed we need to check whether that element is fine or not
            }

        }
    }
}
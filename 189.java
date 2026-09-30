class Solution {
    public void rotate(int[] nums, int k) {

       
        int start=0;
        k = k % nums.length;

        int[] oldNums = nums.clone();

        for(int i = nums.length - k; i < nums.length; i++)    {
            
            nums[start] = oldNums[i];
            start++;
        }

        for(int i=0;i<nums.length-k;i++){
             nums[start] = oldNums[i];
            start++;
        }

       
}}
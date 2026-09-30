class Solution {
    public int[] runningSum(int[] nums) {

        int a=0;

        for(int i=0;i<nums.length;i++){

            a=nums[i]+a;
            nums[i]=a;




        }
        
   return  nums;
   }
}

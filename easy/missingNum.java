class Solution {
    public int missingNum(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length;i++){
            sum=sum^i;
        }

        for(int i=0;i<nums.length;i++){
            sum=sum^nums[i];
        }

        return sum;
   }
}
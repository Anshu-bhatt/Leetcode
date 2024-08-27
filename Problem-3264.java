class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        
        for(int j=0;j<k;j++)
        {
            int min=nums[0], min_i=0;
            //finding the smallest
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]<min)
                {
                    min=nums[i];
                    min_i=i;
                }
            }
            nums[min_i]=(min*multiplier);
        }
        return nums;
    }
}

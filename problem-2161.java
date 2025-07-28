class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> less,high,fi_ar(nums.size());
        int j=0,count=0;
        for(int i=0; i<nums.size(); i++){
            if(nums[i]<pivot)
            {
                less.push_back(nums[i]);
            }
            else if(nums[i]==pivot)
            {
               count++;
            }
            else
            {
                high.push_back(nums[i]);
            }
        }
        for(int n=0;n<less.size();n++)
        {
            fi_ar[j++]=less[n];
        }
        for(int t=0; t<count; t++)
        {fi_ar[j++]=pivot;}
        for(int y=0; y<high.size(); y++)
        {fi_ar[j++]=high[y];}
        return fi_ar;
    }
};

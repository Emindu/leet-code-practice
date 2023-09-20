package org.example.topInterview.array.RemoveDuplicatesSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        int currentCheck = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=currentCheck){
                currentCheck = nums[i];
                nums[n] = nums[i];
                n++;
            }
        }
        return n;

    }
}
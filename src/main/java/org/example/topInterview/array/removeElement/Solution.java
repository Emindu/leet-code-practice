package org.example.topInterview.array.removeElement;

class Solution {

    /**
     * tried
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int notMatchCount = 0;
        int shift = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= shift){
                notMatchCount++;
                continue;
            }
          if (nums[i] == val){
              if(nums[shift] == nums[i]){
                  nums[i] = nums[i] + nums[i+1];
                  nums[i+1] = nums[i] - nums[i+1];
                  nums[i] = nums[i] - nums[i+1];
                  shift--;
              } else {
                  nums[i] = nums[i] + nums[shift];
                  nums[shift] = nums[i] - nums[shift];
                  nums[i] = nums[i] - nums[shift];
                  shift--;
              }

          } else {
              notMatchCount++;
          }
        }
        return notMatchCount;
    }

    /**
     * most accepted
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        int notMatchCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[notMatchCount] = nums[i];
                notMatchCount++;
            }
        }
        return notMatchCount;
    }
}
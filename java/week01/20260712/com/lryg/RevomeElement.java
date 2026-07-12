package com.lryg;

public class RevomeElement {
    public static int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length){
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;

        }
        return slow; // Return the new length of the array
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 3, 3, 2, 2, 2, 2,0,2,4,1,8};
        int val = 2;
        int result = removeElement(nums, val);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
